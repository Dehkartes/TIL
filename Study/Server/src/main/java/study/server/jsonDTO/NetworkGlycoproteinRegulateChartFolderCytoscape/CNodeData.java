package study.server.jsonDTO.NetworkGlycoproteinRegulateChartFolderCytoscape;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CNodeData {
	private String id;
	private double foldChange;
	private String name;
	private double weight;
	private String color;
	private String protein;
}
