package study.server.dto.searched.glycoprotein.identification.chartRowPosition;

import lombok.*;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CRPositionDTO {
	private List<CRPositionData1Element> data1;

}
