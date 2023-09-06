# Collect 20 samples of code from openai give NL
import hashlib
import os
import sys
import json
import random
import openai

openai.api_key = os.environ["OPENAI_API_KEY"]


def get_code(prompt, temperature):
    response = openai.Completion.create(
        model="text-davinci-003",
        prompt=prompt,
        temperature=temperature,
        max_tokens=2048,
        top_p=1,
        frequency_penalty=0,
        presence_penalty=0.0
    )
    
    return response.choices[0].text

def main():
    # prompt for code samples
    prompt = "Write a java function that Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order. A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters."
    prompt_id = "phone_number"

    # Hyperparameter of interest
    temperature = 0.5

   # Create a directory to store the samples
    if not os.path.exists("samples"):
        os.mkdir("samples")
    
    # create a directory to store the prompts as samples/{prompt_id}
    if not os.path.exists(f"samples/{prompt_id}"):
        os.mkdir(f"samples/{prompt_id}")

    # Create a file to store the samples
    with open(f"samples/{prompt_id}.Java", "w") as f:
        #write the prompt to the file & add a new line
        f.write(prompt + "\n")

        #counter for the number of unique samples and total samples
        unique_samples = 0
        total_samples = 0

        #set of hashes for the samples
        hashes = set()

        #loop until we have 20 unique samples
        while unique_samples < 20:
            #increment the number of samples
            total_samples += 1

            #get the code
            code = get_code(prompt, temperature)
            print("Code: ", code)

            #hash the code
            code_hash = hashlib.sha256(code.encode()).hexdigest()

            #check if the code is unique
            if code_hash not in hashes:
               print("Unique code")
                #write the code to the file
               f.write(code + "\n")
               unique_samples += 1
               hashes.add(code_hash)
        print(f"Total samples: {total_samples}")
        print(f"Unique samples: {unique_samples}")



        


if __name__ == "__main__":
    main()