package study.server.dto.statictics.glycoprotein.differentialtest.chartFolderColumn;

import lombok.*;
import study.server.dto.statictics.element.DataLabels;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Column {
	DataLabels dataLabels;
}
