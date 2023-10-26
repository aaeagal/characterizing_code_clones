# Create a sankey diagram for each prompt
import json
import plotly.graph_objects as go
import matplotlib.colors as mcolors
import numpy as np
import matplotlib.pyplot as plt


prompt_ids = ["longestSubstring1","reverseInteger2", "containerWithMostWater3", "3sumClosest5", "maxProductSubarray17"
              ,"minRotatedSortedArray18", "LongestConsecutiveSequence21", "countPrimes23", "kthLargestElement24", "superUglyNumber29"]
def main():
    for prompt in prompt_ids:

        # Load data
        with open(f"../{prompt}/cluster_key.json", "r") as f:
            data = json.load(f)
     
        labels = []
        sources = []
        targets = []
        values = []
        sim_measures = sorted(data.keys())

        Sim_map = {"0.01": " ", "0.05": "  ", "0.25": "   "}

        # label_dict keeps track of indices of already known labels.
        label_dict = {}
        for function in data[sim_measures[0]]:
            label_dict[function] = len(labels)
            labels.append(function)
        
        for i, sim_measure in enumerate(sim_measures):
            for function, clusters in data[sim_measure].items():
                for cluster in clusters:
                    new_label = f"{cluster} {Sim_map[sim_measure]}"
                    if new_label not in label_dict:
                        label_dict[new_label] = len(labels)
                        labels.append(new_label)
                    # source_index references function when sim_measure is "0.01"  
                    # Otherwise it references the cluster from previous sim_measure
                    if sim_measure == "0.01":
                        source_index = label_dict[function]
                    else:
                        prev_label = f"{cluster} {Sim_map[sim_measures[i-1]]}"
                        source_index = label_dict[prev_label]

                    target_index = label_dict[new_label]
                    sources.append(source_index)
                    targets.append(target_index)
                    values.append(1)  # Value / Flow volume
        print(labels)
        # generate the colors, based on the size of labels
        color_1 = np.array(mcolors.to_rgb('tab:blue'))
        color_2 = np.array(mcolors.to_rgb('tab:red'))
        color_count = len(labels)
        diverging_colors = [mcolors.rgb2hex((1-x)*color_1 + x*color_2) for x in np.linspace(0, 1, color_count)]
        fig = go.Figure(go.Sankey(
            arrangement="snap",
            node=dict(
                pad=25,
                thickness=20,
                line=dict(color="black", width=0.5),
                label=labels,
                color=diverging_colors
            ),
            link=dict(
                source=sources,
                target=targets,
                value=values
            )
        ))

        fig.update_layout(title_text=f" {prompt} Sankey Diagram", font_size=13, width=1100, height=500)

        fig.add_annotation(
            x=0.5,
            y=-0.15,
            text="Similarity",
            showarrow=False,
            font_size=15
        )

        # save diagram
        fig.write_image(f"{prompt}_sankey.png")

if __name__ == "__main__":
    main()

