package study.server.dto.statictics.glycoproteion.normalization.common;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CFBoxPlotSeriesData {
	private List<CFBoxPlotSeriesDataData> data;
}
