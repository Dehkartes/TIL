package study.server.dto.searched.glycoprotein.identification.chartRowHistogram;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;
import study.server.dto.searched.element.HistogramElement;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hcd {
	private HashMap<String, List<HistogramElement>> id;

	@JsonAnyGetter
	public HashMap<String, List<HistogramElement>> getId() {
		return id;
	}
}
