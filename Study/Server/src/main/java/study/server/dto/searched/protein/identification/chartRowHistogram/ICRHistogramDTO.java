package study.server.dto.searched.protein.identification.chartRowHistogram;

import lombok.*;
import study.server.dto.searched.element.HistogramElement;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ICRHistogramDTO {
	HashMap<String, List<HistogramElement>> hcd;
}
