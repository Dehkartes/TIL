package study.server.dto.statictics.element;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Line {
	private DataLabels dataLabels;
	private Marker marker;

}
