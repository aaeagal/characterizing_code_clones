import requests
import os
import re
import hashlib
import json

API_URL = ""
headers = {
	"Authorization": "Bearer ",
	"Content-Type": "application/json"
}

def query(payload):
    response = requests.post(API_URL, headers=headers, json=payload)
    if response.status_code != 200:
        raise Exception(f"Request failed with status {response.status_code}")
    try:
        return response.json()
    except ValueError:
        raise ValueError("API response could not be parsed as JSON")

def main():   
    # prompt for code samples
    prompt = "Write a java function that given a string s, find the length of the longest substring without repeating characters. Do not provide an explanation. Provide the source code beginning with the comment //CODESTART and ending with the comment //CODEEND."
    prompt_id = "longestSubstring1"
   # Create a directory to store the samples
    if not os.path.exists("data/codellama"):
        os.mkdir("data/codellama")

    # Create a file to store the samples
    with open(f"data/codellama/{prompt_id}.Java", "w") as f:
        #write the prompt to the file & add a new line
        #f.write(prompt + "\n")

        #counter for the number of unique samples and total samples
        unique_samples = 0
        total_samples = 0
        duplicate_code = 0
        #set of hashes for the samples
        hashes = set()

        #loop until we have 20 unique samples
        while unique_samples < 20:
            #increment the number of samples
            total_samples += 1

            prompt_query = f"{prompt}"
            code_fragment = ""
            code_fragment_record = ""
            while "CODEEND" not in code_fragment:
                code_fragment = query({"inputs": prompt_query})[0]["generated_text"]
                prompt_query += code_fragment
                code_fragment_record += code_fragment
                
            print("Code before preprocessing: -------------------------------------------------------------------------------\n", code_fragment_record)

            # write a regular expression to remove everything outside of source code
            regex = "//CODESTART(.*?)//CODEEND"

            code_fragment_record = re.findall(regex, code_fragment_record, re.DOTALL)

            #check if code and if there's anything in code outside of " " characters 
            if code_fragment_record and code_fragment_record[0].strip(): 
                code_fragment_record = code_fragment_record[0]
            else:
                print("No code found")
                continue


            print("Code after preprocessing: -------------------------------------------------------------------------------\n", code_fragment_record)
            #hash the code
            code_hash = hashlib.sha256(code_fragment_record.encode()).hexdigest()
            
            #check if the code is unique
            if code_hash not in hashes:
               print("Unique code")
                #write the code to the file
               f.write(code_fragment_record + "\n")
               unique_samples += 1
               print("Unique samples: ", unique_samples)
               hashes.add(code_hash)
            else:
                duplicate_code += 1 
                print("Duplicate code: ", duplicate_code)
                
        print(f"Total samples: {total_samples}")
        print(f"Unique samples: {unique_samples}")

if __name__ == "__main__":
    main()
