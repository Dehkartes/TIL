package study.server.jsonDTO.SearchedGlycoproteinIdentification;

import lombok.*;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Id {
	private String name;
	private String color;
	private List <SearchedGlycoproteinIdentificationData> data;
}
