package study.server.dto.searched.protein.identification.chartRowSequence;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

import java.util.HashMap;
import java.util.SimpleTimeZone;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ICRSequencePeptideIdentified {
	private HashMap<String, String> elements;

	@JsonAnyGetter
	public HashMap<String, String> getElements() {
		return elements;
	}

}
