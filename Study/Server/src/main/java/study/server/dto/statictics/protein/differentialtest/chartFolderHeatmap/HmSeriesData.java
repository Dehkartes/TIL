package study.server.dto.statictics.protein.differentialtest.chartFolderHeatmap;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HmSeriesData {
	private String name;
	private int borderWidth;
	private List<Object> data;
	private int turboThreshold;
}
