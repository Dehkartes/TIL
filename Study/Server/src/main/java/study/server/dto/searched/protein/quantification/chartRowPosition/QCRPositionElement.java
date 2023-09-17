package study.server.dto.searched.protein.quantification.chartRowPosition;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QCRPositionElement {
	private int x;
	private String name;
	private QCRPositionDataLabels datalabels;
	private String color;
	private int colorIndex;
	private String description;
	private QCRPositionMarker marker;

}
