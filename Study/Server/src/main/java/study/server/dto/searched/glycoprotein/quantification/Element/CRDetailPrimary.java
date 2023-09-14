package study.server.dto.searched.glycoprotein.quantification.Element;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import study.server.dto.searched.element.Marker;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CRDetailPrimary {
	private String name;
	private CRPrimaryDataLabels dataLabels;
	private String color;
	private int colorIndex;
	private Marker marker;
}
