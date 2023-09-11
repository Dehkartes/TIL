package study.server.dto.statictics.glycoproteion.common;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class XAxis {
	private List<String> categories;
	private Title title;
}
