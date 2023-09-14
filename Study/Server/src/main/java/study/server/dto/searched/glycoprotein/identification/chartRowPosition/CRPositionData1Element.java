package study.server.dto.searched.glycoprotein.identification.chartRowPosition;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;
import study.server.dto.searched.element.Detail;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CRPositionData1Element {
	private HashMap<String, List<Detail>> data1Element;
	@JsonAnyGetter()
	public HashMap<String, List<Detail>> getData1Element() {
		return data1Element;
	}
}
