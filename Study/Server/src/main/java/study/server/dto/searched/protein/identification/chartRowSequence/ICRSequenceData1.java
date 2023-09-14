package study.server.dto.searched.protein.identification.chartRowSequence;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.HashMap;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ICRSequenceData1 {
	private HashMap<String,Integer> protein_length;
	private HashMap<String,Integer> protein_sequence;
}
