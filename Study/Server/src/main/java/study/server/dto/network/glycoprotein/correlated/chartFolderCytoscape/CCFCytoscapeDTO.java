package study.server.dto.network.glycoprotein.correlated.chartFolderCytoscape;

import lombok.*;
import study.server.dto.network.element.Nodes;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CCFCytoscapeDTO {
	private List<Nodes> nodes;
}
