package study.server.dto.statictics.protein.normalization.chartSingleBeforeColumn1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import study.server.dto.statictics.element.*;

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
		"plotOption",
		"series"
})
public class CSBeforeColumn1DTO {
	private Chart chart;
	private Title title;
	@JsonProperty("xAxis")
	private XAxis xAxis;
	@JsonProperty("yAxis")
	private YAxis yAxis;
	private CSColumn2PlotOption plotOption;
	private List<CSColumn2SeriesData> series;
}

