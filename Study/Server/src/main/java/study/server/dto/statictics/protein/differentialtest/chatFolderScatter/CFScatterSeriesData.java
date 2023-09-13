package study.server.dto.statictics.protein.differentialtest.chatFolderScatter;

import lombok.*;

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
