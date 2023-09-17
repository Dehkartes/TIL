package study.server.dto.searched.protein.identification.chartRowSequence;

import lombok.*;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ICRSequenceData2 {
	private HashMap<String, List<String>> peptide_identified;
	private HashMap<String, HashMap<String, List<Integer>>> peptide_located;
}
