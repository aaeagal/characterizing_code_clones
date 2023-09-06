# Collect 20 samples of code from openai give NL
import hashlib
import os
import sys
import json
import random
import openai

openai.api_key = os.environ["OPENAI_API_KEY"]


def get_code(prompt):
    response = openai.ChatCompletion.create(
        model="gpt-3.5-turbo",
        messages=[
        {
            "role": "user",
            "content": f'{prompt}\n'
        }
        ],
        temperature=1,
        max_tokens=2048,
        top_p=1,
        frequency_penalty=0,
        presence_penalty=0
    )
    return response["choices"][0]["message"]["content"]

def main():
    # prompt for code samples
    prompt = "Write a java function that given an integer array nums of length n and an integer target, finds three integers in nums such that the sum is closest to target. Return the sum of the three integers. Please only give me the source code. No explanation."

    prompt_id = "3SumClosest5"

   # Create a directory to store the samples
    if not os.path.exists("data"):
        os.mkdir("data")

    # Create a file to store the samples
    with open(f"data/nl_prompt/{prompt_id}.Java", "w") as f:
        #write the prompt to the file & add a new line
        #f.write(prompt + "\n")

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
            code = get_code(prompt)
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