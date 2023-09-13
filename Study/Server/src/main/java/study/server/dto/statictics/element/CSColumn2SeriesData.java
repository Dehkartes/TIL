package study.server.dto.statictics.element;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CSColumn2SeriesData {
	private String name;
	private List<Integer> data;
	private double pointStart;
	private double pointInterval;
}
