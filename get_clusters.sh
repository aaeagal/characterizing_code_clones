
#!/bin/bash

# Define the threshold values
threshold_values=(0.01 0.05 0.10 0.15 0.20 0.25 0.30)

# Set the remote path 
remote_path="/home/slacc/Raise/ProgramRepair/SLACC/code/meta_results/Example/clusters/cluster_testing"

# Define the local path
local_path="/home/aeagal/characterizing_code_clones/data/gpt_3.5/clusters/reverseInteger2"

# Replace slacc@<remote-IP> with your actual username and server's IP/hostname
remote_host="slacc@10.153.23.47"

password="slacc"

# For each threshold value
for threshold in "${threshold_values[@]}"
do
  # use scp to copy the file only_java.txt from the remote machine to your local machine
  sshpass -p "$password" scp "${remote_host}:${remote_path}/eps_${threshold}/only_java.txt" "${local_path}/${threshold}/only_java_${threshold}.txt"
  sshpass -p "$password" scp "${remote_host}:${remote_path}/eps_${threshold}/only_java.txt" "${local_path}/${threshold}/java_python.md
done 
