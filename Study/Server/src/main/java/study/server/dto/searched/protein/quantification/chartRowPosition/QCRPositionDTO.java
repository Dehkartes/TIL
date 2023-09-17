package study.server.dto.searched.protein.quantification.chartRowPosition;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QCRPositionDTO {

	private HashMap<String, List<QCRPositionElement>> positionMap;
	@JsonAnyGetter
	public HashMap<String, List<QCRPositionElement>> getPositionMap() {
		return positionMap;
	}
}
