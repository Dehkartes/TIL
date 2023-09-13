package study.server.dto.statictics.element;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import study.server.dto.statictics.glycoprotein.differentialtest.chartFolderColumn.Column;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlotOptions {
	private Column column;
	private Series series;
}
