package study.server.dto.searched.protein.identification.chartRowSequence;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.List;

public class ICRSequencePeptideLocatedSub {
	private HashMap<String, List<Integer>> elements;

	@JsonAnyGetter
	public HashMap<String, List<Integer>> getElements() {
		return elements;
	}
}