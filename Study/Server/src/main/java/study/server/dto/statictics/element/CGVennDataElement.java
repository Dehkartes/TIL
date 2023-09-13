package study.server.dto.statictics.element;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CGVennDataElement {
	private String name;
	private List<String> sets;
	private int value;
}
