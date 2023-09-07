package study.server.jsonDTO.NetworkGlycoproteinRegulateChartFolderCytoscape;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NetworkGlycoproteinRegulateChartFolderCytoscapeDTO {
	private List<CNodeData> nodes;
}
