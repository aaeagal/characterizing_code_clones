import json 
def main(): 
    # for every directory in data/gpt4/clusters
    prompt_ids = ["longestSubstring1","reverseInteger2", "containerWithMostWater3", "3sumClosest5", "maxProductSubarray17"
              ,"minRotatedSortedArray18", "LongestConsecutive21", "countPrimes23", "kthLargestElements24", "superUglyNumber29", "rectangleArea27"]
    
    for prompt in prompt_ids:
        # Load data
        with open(f"{prompt}/cluster_key.json", "r") as f:
            data = json.load(f)
     
        # check to see how many keys are in each sim_measure
        sim_measures = sorted(data.keys())

        for i, sim_measure in enumerate(sim_measures):
            print(f"{prompt}: {len(data[sim_measure])}")

if __name__ == "__main__":
    main()