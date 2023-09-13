package study.server.dto.statictics.element;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeriesData {
	private String type;
	private String name;
	private List<Double> data;
	private String color;
	private Marker marker;
}
