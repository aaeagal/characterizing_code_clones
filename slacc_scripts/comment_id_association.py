import argparse
import json
def main():
    # Parse command line arguments
    parser = argparse.ArgumentParser()
    parser.add_argument('directory', type=str, help='choose a prompt directory in data')
    args = parser.parse_args()

    # Read in slacc_input.Java
    function_dict = {}
    current_function = None
    with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/slacc_input.Java', 'r') as f:

        # Read lines from the file
        lines = f.readlines()

        for line in lines:
            # if a function is found, get the function name
            if 'public' in line and 'class' not in line:
                split_line = line.split()
                for word in split_line:
                    if '(' in word:
                        function_name = word.split('(')[0]
                        function_dict[function_name] = []  # Initialize function in dict
                        current_function = function_name  # Set current function
                        break

            # If inside a function, extract the comment
            if current_function and '//' in line:
                comment = line.split(' // ')[1].strip()
                function_dict[current_function].append(comment)

    # Do something with output_lines, such as writing to a new file:
    with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/function_id_info.json', 'w') as f:
        json.dump(function_dict, f)


        

if __name__ == '__main__':
    main()