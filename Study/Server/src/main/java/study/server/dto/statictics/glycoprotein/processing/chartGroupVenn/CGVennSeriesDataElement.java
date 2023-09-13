package study.server.dto.statictics.glycoprotein.processing.chartGroupVenn;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CGVennSeriesDataElement {
	private String name;
	private List<String> sets;
	private int value;
}
