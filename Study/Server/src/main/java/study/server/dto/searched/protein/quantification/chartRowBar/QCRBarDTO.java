package study.server.dto.searched.protein.quantification.chartRowBar;

import lombok.*;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QCRBarDTO {
	private List<HashMap<String, List<List<Object>>>> data1;
}
