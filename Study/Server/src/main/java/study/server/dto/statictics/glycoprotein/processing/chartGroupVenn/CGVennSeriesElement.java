package study.server.dto.statictics.glycoprotein.processing.chartGroupVenn;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CGVennSeriesElement {
	private List<CGVennSeriesDataElement> data;
}
