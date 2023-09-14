package study.server.dto.searched.element;

import lombok.*;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class HistogramElement {
	private String name;
	private String color;
	private List <HistogramData> data;
}
