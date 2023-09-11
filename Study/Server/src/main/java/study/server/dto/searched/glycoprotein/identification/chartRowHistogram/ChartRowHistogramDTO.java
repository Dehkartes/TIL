package study.server.dto.searched.glycoprotein.identification.chartRowHistogram;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChartRowHistogramDTO {
	List<Hcd> hcd;
	List<Cid> cid;
	List<Etd> etd;
}
