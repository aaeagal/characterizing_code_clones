import argparse
import json
import os
import re
def main():
    # Parse command line arguments
    parser = argparse.ArgumentParser()
    parser.add_argument('directory', type=str, help='choose a prompt directory in data')
    args = parser.parse_args()

    # Get the function id info
    with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/function_id_info.json', 'r') as f:
        function_dict = json.load(f)
    
    
    thresholds = ['0.01', '0.05', '0.10', '0.15', '0.20', '0.25', '0.30']
    thresholds_dict = {}
    clusters_dict = {}

    #for every directory in the clusters directory
    for threshold in thresholds:
        # open the only_java_{threshold}.txt file
        with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/{threshold}/only_java_{threshold}.txt', 'r') as file:
            data = {}  # initialize dictionary
            # get function hex names and id numbers
            for line in file:
                line = line.strip()  # remove leading/trailing whitespace
                if line.startswith('public static'):
                    current_function = line.split()[3].split('(')[0]  # get function name
                    data[current_function] = []  # initialize list for this function
                elif line.startswith('//'):
                    data[current_function].append(line.split()[1])  # append line number


            # For every value in the function_dict and data, if the value is the same, then print the corresponding keys
            matches = {}
            for key1, val1 in function_dict.items():
                matches[key1] = []
                for key2, val2 in data.items():
                    if val1 == val2:
                        matches[key1].append(key2)

            thresholds_dict.update({threshold: matches})

            print(thresholds_dict)
            
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

        print(clusters_dict)
    # Write the dictionary to a json file
    with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/function_key.json', 'w') as f:
        json.dump(thresholds_dict, f, indent=4)
    
    # Write the dictionary to a json file
    with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/cluster_key.json', 'w') as f:
        json.dump(clusters_dict, f, indent=4)


if __name__ == '__main__':
    main()