package study.server.jsonDTO.SearchedGlycoproteinIdentification;

import lombok.*;

import java.util.List;
import java.util.Map;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etd {
	Map<String, List<Id>> id;
}
