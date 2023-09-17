package study.server.dto.searched.protein.quantification.chartRowPosition;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QCRPositionMarker {
	private String symbol;
	private int radius;
}
