import argparse
import json
import os
import re
from collections import Counter


def main():
    # Parse command line arguments
    parser = argparse.ArgumentParser()
    parser.add_argument('directory', type=str, help='choose a prompt directory in data')
    args = parser.parse_args()

    # Get the function id info
    with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/function_id_info.json', 'r') as f:
        function_dict = json.load(f)
    
    
    thresholds = ['0.01', '0.05', '0.25']
    thresholds_dict = {}
    clusters_dict = {}

    #for every directory in the clusters directory
    for threshold in thresholds:
        # open the only_java_{threshold}.txt file
        with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/{threshold}/only_java_{threshold}.txt', 'r') as file:
            data = {}  # initialize dictionary
    #for every directory in the clusters directory
    for threshold in thresholds:
        # open the only_java_{threshold}.txt file
        with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/{threshold}/only_java_{threshold}.txt', 'r') as file:
            data = {}  # initialize dictionary
            
            # get function hex names and id numbers
            for line in file:
                match = re.search(r'//\s(\d+)', line) # get line number
                line = line.strip()  # remove leading/trailing whitespace
                if line.startswith('public static'):
                    current_function = line.split()[3].split('(')[0]  # get function name
                    data[current_function] = []  # initialize list for this function
                elif match:
                      data[current_function].append(int(match.group(1)))  # append line number
                elif line.startswith('return'):
                    data[current_function].append(line)


            # dump the dictionary to a json file
            with open(f'13th_reason.json', 'w') as f:
                json.dump(data, f, indent=4)
            
            # For every value in the function_dict and data, if the value is the same, then print the corresponding keys
            matches = {}
            for key1, val1 in function_dict.items():
                matches[key1] = []
                for key2, val2 in data.items():
                    # make sure same type
                    val1 = [str(i) for i in val1]
                    val2 = [str(i) for i in val2]
                    # make sure strip whitespace
                    val1 = [i.strip() for i in val1]
                    val2 = [i.strip() for i in val2]
                    # compare the two lists, if the same outside of one differing value, then append the key to the matches dictionary
                    if val1 == val2:
                        matches[key1].append(key2)

            thresholds_dict.update({threshold: matches})         
            
            file.seek(0)
            tmp = dict(matches)  # copy the dictionary
            for line in file:
                line = line.strip()  # remove leading/trailing whitespace

                if line.startswith('****** Cluster'):
                    current_cluster = line  # get cluster number

                if line.startswith('public static'):
                    func_name = line.split()[3].split('(')[0]  # get function name
                    for key, values in tmp.items(): # if the function name is in the matches dictionary
                        tmp[key] = [current_cluster if value == func_name else value for value in values] 

            clusters_dict.update({threshold: tmp})

    # Write the dictionary to a json file
    with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/function_key.json', 'w') as f:
        json.dump(thresholds_dict, f, indent=4)
    
    # Write the dictionary to a json file
    with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/cluster_key.json', 'w') as f:
        json.dump(clusters_dict, f, indent=4)


if __name__ == '__main__':
    main()