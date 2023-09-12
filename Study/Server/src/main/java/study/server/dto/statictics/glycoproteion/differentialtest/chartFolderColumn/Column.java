package study.server.dto.statictics.glycoproteion.differentialtest.chartFolderColumn;

import lombok.*;
import study.server.dto.statictics.glycoproteion.common.DataLabels;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Column {
	DataLabels dataLabels;
}
