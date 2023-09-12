package study.server.dto.statictics.glycoproteion.differentialtest.chatFolderLine;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import study.server.dto.statictics.glycoproteion.common.Chart;
import study.server.dto.statictics.glycoproteion.common.Title;
import study.server.dto.statictics.glycoproteion.common.XAxis;
import study.server.dto.statictics.glycoproteion.common.YAxis;
import study.server.dto.statictics.glycoproteion.common.SeriesData;

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
		"plotOptions",
		"series"
})
public class CFLineDTO {
	private Chart chart;
	private Title title;
	@JsonProperty("xAxis")
	private XAxis xAxis;
	@JsonProperty("yAxis")
	private YAxis yAxis;
	private CFLinePlotOption plotOptions;
	private List<SeriesData> series;
}
