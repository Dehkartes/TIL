package study.server.dto.statictics.glycoprotein.processing.chartGroupVenn;

import lombok.*;
import study.server.dto.statictics.element.Chart;
import study.server.dto.statictics.element.Title;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CGVennDTO {
	private Chart chart;
	private Title title;
	private List<CGVennSeriesElement> series;
}
