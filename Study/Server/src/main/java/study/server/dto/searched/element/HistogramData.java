package study.server.dto.searched.element;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistogramData {
	private double x;
	private double y;
	private String labels;
}
