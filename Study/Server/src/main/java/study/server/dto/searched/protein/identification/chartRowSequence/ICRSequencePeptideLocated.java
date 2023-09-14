package study.server.dto.searched.protein.identification.chartRowSequence;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

import java.util.HashMap;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ICRSequencePeptideLocated {
	private HashMap<String, String> elements;

	@JsonAnyGetter
	public HashMap<String, String> getElements() {
		return elements;
	}
}
