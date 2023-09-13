package study.server.dto.statictics.glycoprotein.normalization.chartSingleBeforeColumn1;

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
		"series"
})
public class CSBeforeColumn1DTO {
	private Chart chart;
	private Title title;
	@JsonProperty("xAxis")
	private XAxis xAxis;
	@JsonProperty("yAxis")
	private YAxis yAxis;
	private List<CSColumn2SeriesData> series;

}

