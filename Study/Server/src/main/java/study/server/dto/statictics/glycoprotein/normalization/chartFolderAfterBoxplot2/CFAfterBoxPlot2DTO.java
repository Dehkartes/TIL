package study.server.dto.statictics.glycoprotein.normalization.chartFolderAfterBoxplot2;

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
		"plotOptions",
		"title",
		"legend",
		"xAxis",
		"series"
})
public class CFAfterBoxPlot2DTO {
	private Chart chart;
	private PlotOptions plotOptions;
	private Title title;
	private Legend legend;
	@JsonProperty("xAxis")
	private XAxis xAxis;
	private List<CFBoxPlotSeriesData> series;
}
