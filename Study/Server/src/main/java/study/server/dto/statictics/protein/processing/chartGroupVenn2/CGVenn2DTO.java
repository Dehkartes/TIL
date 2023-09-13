package study.server.dto.statictics.protein.processing.chartGroupVenn2;

import lombok.*;
import study.server.dto.statictics.element.CGVennDataElement;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CGVenn2DTO {
	private String type;
	private String titie;
	private List<CGVennDataElement> data;
}
