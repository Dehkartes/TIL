package study.server.dto.statictics.glycoproteion.differentialtest.chatFolderScatter;

import lombok.*;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CFScatterSeriesData {
	private String name;
	private List<CFScatterSeriesDataData> data;
}
