package study.server.dto.statictics.glycoproteion.common;

import lombok.*;
import org.yaml.snakeyaml.error.Mark;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Line {
	private DataLabels dataLabels;
	private Marker marker;

}
