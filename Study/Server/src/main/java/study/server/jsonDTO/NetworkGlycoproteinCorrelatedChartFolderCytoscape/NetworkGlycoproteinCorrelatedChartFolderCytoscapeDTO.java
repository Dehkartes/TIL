package study.server.jsonDTO.NetworkGlycoproteinCorrelatedChartFolderCytoscape;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NetworkGlycoproteinCorrelatedChartFolderCytoscapeDTO {
	private List<Nodes> nodes;
}
