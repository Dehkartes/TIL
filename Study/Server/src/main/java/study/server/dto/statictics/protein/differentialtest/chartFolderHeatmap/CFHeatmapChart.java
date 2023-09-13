package study.server.dto.statictics.protein.differentialtest.chartFolderHeatmap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
