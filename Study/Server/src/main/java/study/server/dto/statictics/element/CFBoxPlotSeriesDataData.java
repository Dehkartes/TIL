package study.server.dto.statictics.element;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CFBoxPlotSeriesDataData {
	private String name;
	private int x;
	private double low;
	private double q1;
	private double median;
	private double q3;
	private double high;
	private String fillColor;
}
