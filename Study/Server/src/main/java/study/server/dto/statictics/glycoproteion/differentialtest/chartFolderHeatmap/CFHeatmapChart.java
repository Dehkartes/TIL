package study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CFHeatmapChart extends study.server.dto.statictics.glycoproteion.common.Chart {
	private int plotBorderWidth;
}
