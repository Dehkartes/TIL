package study.server.dto.statictics.element;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CSColumn2PlotOptionSeries {
	private int pointPadding;
	private int groupPadding;
	private double borderWidth;
	private String borderColor;
}
