package study.server.dto.statictics.glycoproteion.differentialtest.chatFolderLine;

import lombok.*;
import study.server.dto.statictics.glycoproteion.common.Line;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderColumn.Column;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CFLinePlotOption {
	private Line line;
}
