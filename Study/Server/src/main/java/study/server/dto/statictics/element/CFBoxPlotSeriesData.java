package study.server.dto.statictics.element;

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
