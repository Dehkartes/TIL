package study.server.dto.searched.glycoprotein.quantification.Element;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import study.server.dto.searched.element.DataLabels;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CRDetailOther {
	private Integer x;
	private String name;
	private List<Integer> data;
	private String color;
	private Integer colorIndex;
	private String description;
	private DataLabels dataLabels;
}
