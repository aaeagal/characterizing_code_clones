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
    prompt = "Write a Java function that given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water. Here are the constraints: m == grid.length, n == grid[i].length, 1 <= m, n <= 300, grid[i][j] is '0' or '1'.Do not provide an explanation. Just give me the source code."
    prompt_id = "numberOfIslands26"
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