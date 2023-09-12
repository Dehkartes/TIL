package study.server.dto.searched.glycoprotein.identification.chartRowHistogram;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CRHistogramData {
	private double x;
	private double y;
	private String labels;
}
