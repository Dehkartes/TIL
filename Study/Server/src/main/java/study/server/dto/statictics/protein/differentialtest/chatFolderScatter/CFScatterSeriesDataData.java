package study.server.dto.statictics.protein.differentialtest.chatFolderScatter;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CFScatterSeriesDataData {
	private String key;
	private double x;
	private double y;
}
