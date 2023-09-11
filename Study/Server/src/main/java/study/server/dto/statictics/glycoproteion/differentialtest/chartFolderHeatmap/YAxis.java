package study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({
		"categories",
		"title"
})
public class YAxis extends study.server.dto.statictics.glycoproteion.common.YAxis{
	private List<String> categories;
}
