package study.server.dto.searched.element;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import study.server.dto.searched.element.DataLabels;
import study.server.dto.searched.element.Marker;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Detail {
	private Integer x;
	private String color;
	private String description;
	private DataLabels dataLabels;
	private Marker marker;
}
