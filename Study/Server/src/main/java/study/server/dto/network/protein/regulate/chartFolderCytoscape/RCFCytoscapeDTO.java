package study.server.dto.network.protein.regulate.chartFolderCytoscape;

import lombok.*;
import study.server.dto.network.common.Nodes;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RCFCytoscapeDTO {
	private List<Nodes> nodes;
}
