package study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ColorAxis {
	private int min;
	private int max;
	private String minColor;
	private String maxColor;
	private List<List<Object>> stops;
	private boolean startOnTick;
	private boolean endOnTick;
	private String borderColor;
	private ColorAxisLabels labels;
}
