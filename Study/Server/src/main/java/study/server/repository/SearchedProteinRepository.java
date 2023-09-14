package study.server.repository;

import org.springframework.stereotype.Repository;
import study.server.dto.searched.element.*;
import study.server.dto.searched.protein.identification.chartRowHistogram.ICRHistogramDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class SearchedProteinRepository {

	public ICRHistogramDTO getICRHistogramDTO() {
		HashMap<String, List<HistogramElement>> hcd = new HashMap<>();
		List<HistogramElement> value = new ArrayList<>();
		List<HistogramData> data = new ArrayList<>();
		data.add(HistogramData.builder()
						.x(147.11251831054688)
						.y(50.08677284103419)
						.labels("147.113(y1(+1))")
				.build());
		data.add(HistogramData.builder()
				.x(218.1498260498047)
				.y(33.73819472460976)
				.labels(" 218.150(y2(+1))")
				.build());
		value.add(HistogramElement.builder()
						.name("Unmatched_ions")
						.color("#ADADAD")
						.data(data)
				.build());
		hcd.put("9062", value);

		List<HistogramElement> value2 = new ArrayList<>();
		List<HistogramData> data2 = new ArrayList<>();
		data2.add(HistogramData.builder()
				.x(147.11251831054688)
				.y(50.08677284103419)
				.labels("147.113(y1(+1))")
				.build());
		data2.add(HistogramData.builder()
				.x(218.1498260498047)
				.y(33.73819472460976)
				.labels(" 218.150(y2(+1))")
				.build());
		value2.add(HistogramElement.builder()
				.name("Unmatched_ions")
				.color("#ADADAD")
				.data(data2)
				.build());
		hcd.put("9828", value2);
		return ICRHistogramDTO.builder()
				.hcd(hcd)
				.build();
	}
}
