package study.server.dto.statictics.glycoproteion.differentialtest.chartFolderColumn;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeriesData {
	String name;
	List<Double> data;
}
