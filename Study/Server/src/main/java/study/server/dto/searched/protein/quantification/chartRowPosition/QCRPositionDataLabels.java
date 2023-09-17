package study.server.dto.searched.protein.quantification.chartRowPosition;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QCRPositionDataLabels {
	private boolean enabled;
	private String connectorColor;
	private String connectorWidth;
	private int borderWidth;
	private boolean useHTML;
	private String format;
	private String description;
	private int x;
	private int y;
}
