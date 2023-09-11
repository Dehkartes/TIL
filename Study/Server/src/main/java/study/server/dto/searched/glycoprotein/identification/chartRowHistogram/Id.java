package study.server.dto.searched.glycoprotein.identification.chartRowHistogram;

import lombok.*;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Id {
	private String name;
	private String color;
	private List <ChartRowHistogramData> data;
}
