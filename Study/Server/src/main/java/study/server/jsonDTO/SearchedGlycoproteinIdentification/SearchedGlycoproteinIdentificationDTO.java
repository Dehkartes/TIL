package study.server.jsonDTO.SearchedGlycoproteinIdentification;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchedGlycoproteinIdentificationDTO {
	List<Hcd> hcd;
	Cid cid;
	Etd etd;
}
