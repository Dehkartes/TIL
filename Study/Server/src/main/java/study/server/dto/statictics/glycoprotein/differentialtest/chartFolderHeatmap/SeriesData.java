package study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeriesData {
	private String name;
	private int borderWidth;
	private List<Object> data;
	private int turboThreshold;
}
