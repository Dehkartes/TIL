package study.server.dto.statictics.protein.processing.chartSingleQqplotBefore;

import lombok.*;
import study.server.dto.statictics.element.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CSQqplotBeforeDTO {
	private Chart chart;
	private Title title;
	private XAxis xAxis;
	private YAxis yAxis;
	private List<SeriesDataqq> series;
}
