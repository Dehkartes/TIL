package study.server.jsonDTO.SearchedGlycoproteinIdentification;

import lombok.*;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchedGlycoproteinIdentificationDTO {
	Hcd hcd;
	Cid cid;
	Etd etd;
}
