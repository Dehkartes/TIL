package study.server.jsonDTO.SearchedGlycoproteinIdentification;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchedGlycoproteinIdentificationData {
	private double x;
	private double y;
	private String labels;
}
