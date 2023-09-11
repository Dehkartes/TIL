package study.server.dto.network.common;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NodeData {
	private String id;
	private double foldChange;
	private String name;
	private double weight;
	private String color;
	private String protein;
}
