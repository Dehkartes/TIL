package study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import study.server.dto.statictics.glycoproteion.common.Title;
import study.server.dto.statictics.glycoproteion.common.XAxis;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({
		"chart",
		"title",
		"xAxis",
		"yAxis",
		"colorAxis",
		"series"
})
public class CFHeatmapDTO {
	private CFHeatmapChart chart;
	private Title title;
	@JsonProperty("xAxis")
	private XAxis xAxis;
	@JsonProperty("yAxis")
	private YAxis yAxis;
	private ColorAxis colorAxis;
	private List<SeriesData> series;
}
