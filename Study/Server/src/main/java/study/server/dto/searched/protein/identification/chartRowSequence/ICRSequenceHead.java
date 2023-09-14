package study.server.dto.searched.protein.identification.chartRowSequence;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ICRSequenceHead {
	private String type;
	private String title;
	private String data1;
	private String data2;
}
