package study.server.dto.statictics.glycoproteion.normalization.chartFolderBeforeBoxplot1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import study.server.dto.statictics.glycoproteion.common.*;
import study.server.dto.statictics.glycoproteion.normalization.common.CFBoxPlotSeriesData;

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
public class CFBeforeBoxPlot1DTO {
	private Chart chart;
	private PlotOptions plotOptions;
	private Title title;
	private Legend legend;
	@JsonProperty("xAxis")
	private XAxis xAxis;
	private List<CFBoxPlotSeriesData> series;
}
