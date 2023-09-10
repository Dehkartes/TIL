package study.server.jsonDTO.SearchedGlycoproteinIdentification;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

import java.util.HashMap;
import java.util.List;

@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hcd {
	private HashMap<String, List<Id>> id;

	@JsonAnyGetter
	public HashMap<String, List<Id>> getId() {
		return id;
	}
}
