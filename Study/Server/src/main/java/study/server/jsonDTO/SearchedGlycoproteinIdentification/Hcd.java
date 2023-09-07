package study.server.jsonDTO.SearchedGlycoproteinIdentification;

import lombok.*;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hcd {
	HashMap<String, List<Id>> id;
}
