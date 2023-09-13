package study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap;

import lombok.*;
import lombok.experimental.SuperBuilder;
import study.server.dto.statictics.element.Chart;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CFHeatmapChart extends Chart {
	private int plotBorderWidth;
}
