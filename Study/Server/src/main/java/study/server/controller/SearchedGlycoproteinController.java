package study.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.server.dto.searched.glycoprotein.identification.chartRowHistogram.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/searched/glycoprotein")
public class SearchedGlycoproteinController {
	@GetMapping("/identification/chart/row/histogram/")
	public String getSearchedGlycoproteinIdentification() throws JsonProcessingException {
		List<ChartRowHistogramData> dataList = new ArrayList<>();
		dataList.add(ChartRowHistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		Id id1 = Id.builder().name("Unmatched_ions").color("#ADADAD").data(dataList).build();
		List<Id> idList = new ArrayList<>();
		idList.add(id1);
		HashMap<String,List<Id>> idmap = new HashMap<>();
		idmap.put("30526_30537", idList);
		Hcd hcd = Hcd.builder().id(idmap).build();
		List<Hcd> hcdList = new ArrayList<>();
		hcdList.add(hcd);

		List<ChartRowHistogramData> dataList2 = new ArrayList<>();
		dataList2.add(ChartRowHistogramData.builder().x(558.4691).y(6.071279032536145).labels("None").build());
		Id id2 = Id.builder().name("Unmatched_ions").color("#ADADAD").data(dataList).build();
		List<Id> idList2 = new ArrayList<>();
		idList2.add(id2);
		HashMap<String,List<Id>> idmap2 = new HashMap<>();
		idmap2.put("30526_30528", idList2);
		Cid cid = Cid.builder().id(idmap2).build();
		List<Cid> cidList = new ArrayList<>();
		cidList.add(cid);

		List<ChartRowHistogramData> dataList3 = new ArrayList<>();
		dataList3.add(ChartRowHistogramData.builder().x(156.4406).y(4.463877756536011).labels("None").build());
		Id id3 = Id.builder().name("Unmatched_ions").color("#ADADAD").data(dataList).build();
		List<Id> idList3 = new ArrayList<>();
		idList3.add(id3);
		HashMap<String,List<Id>> idmap3 = new HashMap<>();
		idmap3.put("30526_30532", idList3);
		Etd eid = Etd.builder().id(idmap3).build();
		List<Etd> etdList = new ArrayList<>();
		etdList.add(eid);


		ChartRowHistogramDTO result = ChartRowHistogramDTO.builder().hcd(hcdList).cid(cidList).etd(etdList).build();

		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
		System.out.println(json);

		return json;
	}
}
