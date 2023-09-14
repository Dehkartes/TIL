package study.server.dto.searched.glycoprotein.quantification.chartRowPosition;

import lombok.*;
import study.server.dto.searched.element.GlyQuantiCRStackBar;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QCRPositionDTO {
	private GlyQuantiCRStackBar stack_bar;
	private HashMap<String, List<Object>> data1;
	private HashMap<String, List<Object>> data2;
}
