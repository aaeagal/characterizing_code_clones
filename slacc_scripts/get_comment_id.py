import argparse


def main():
    # Parse command line arguments
    parser = argparse.ArgumentParser()
    parser.add_argument('directory', type=str, help='choose a prompt directory in data')
    args = parser.parse_args()

    # Read in preprocessed.Java
    with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/preprocessed.Java', 'r') as f:
        function_counter = 0
        output_lines = []
        line_counter = 0

        # Read lines from the file
        lines = f.readlines()

        for line in lines:
            line = line.rstrip()  # clean existing trailing newlines/spaces
            append_comment = False  

            if 'class' in line:
                output_lines.append(line)
                continue

            if 'public' in line:
                function_counter += 1
                print("Function counter: ", function_counter)
                output_lines.append(line)
                continue
            
            if 'return' in line:
                output_lines.append(line)
                continue
            
            # if the line only has whitespace or is empty, then skip it
            stripped_line = line.strip()
            if stripped_line and not any(c not in (' ', '\t', '\n', '{', '}') for c in stripped_line):
                output_lines.append(line)
                continue

            # if the line starts with a java import, then skip it
            if line.startswith('import'):
                output_lines.append(line)
                continue

            # unless the line is completely empty or only contains whitespace, append_comment to True
            if line and not line.isspace():
                append_comment = True

            # for all other lines if `append_comment` is True, then add a comment to the end of the line
            if append_comment:
                line_counter += 1
                line += ' // ' + str(line_counter)

            # Append modified line to output_lines
            output_lines.append(line)

    # Do something with output_lines, such as writing to a new file:
    with open(f'/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/{args.directory}/slacc_input.Java', 'w') as f:
        for line in output_lines:
            f.write(line + '\n')

if __name__ == '__main__':
    main()