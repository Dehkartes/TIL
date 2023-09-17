package study.server.dto.searched.protein.identification.chartRowSequence;

import lombok.*;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ICRSequenceDTO {
	private List<Object> protein_sequence;
}
