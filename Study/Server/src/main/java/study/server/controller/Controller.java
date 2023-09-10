package study.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Node;
import study.server.Chart.Chart;
import study.server.Chart.ChartRepository;
import study.server.jsonDTO.NetworkGlycoproteinCorrelatedChartFolderCytoscape.NetworkGlycoproteinCorrelatedChartFolderCytoscapeDTO;
import study.server.jsonDTO.NetworkGlycoproteinCorrelatedChartFolderCytoscape.NodeData;
import study.server.jsonDTO.NetworkGlycoproteinCorrelatedChartFolderCytoscape.Nodes;
import study.server.jsonDTO.NetworkGlycoproteinRegulateChartFolderCytoscape.CNodeData;
import study.server.jsonDTO.NetworkGlycoproteinRegulateChartFolderCytoscape.NetworkGlycoproteinRegulateChartFolderCytoscapeDTO;
import study.server.jsonDTO.SearchedGlycoproteinIdentification.SearchedGlycoproteinIdentificationData;
import study.server.jsonDTO.SearchedGlycoproteinIdentification.Hcd;
import study.server.jsonDTO.SearchedGlycoproteinIdentification.Id;
import study.server.jsonDTO.SearchedGlycoproteinIdentification.SearchedGlycoproteinIdentificationDTO;
import study.server.jsonDTO.Venn.VennDTO;
import study.server.jsonDTO.Venn.VennData;

import javax.xml.crypto.Data;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@RestController
public class Controller {
	@Autowired
	ChartRepository chartRepository;

	@GetMapping("/NetworkGlycoproteinCorrelatedChartFolderCytoscape")
	public String getNetworkGlycoproteinCorrelatedChartFolderCytoscape() throws JsonProcessingException {
		List<Nodes> nodeData = new ArrayList<>();
		NodeData data = NodeData.builder().
			id("Psmd7").
			foldChange(0.68).
			name("Psmd7").
			weight(0.0).
			color("#FFB8B8").
			protein("sp|P26516|PSMD7_MOUSE").
			build();
		Nodes nod = Nodes.builder().
				data(data).
				build();
		nodeData.add(nod);
		NetworkGlycoproteinCorrelatedChartFolderCytoscapeDTO inst = NetworkGlycoproteinCorrelatedChartFolderCytoscapeDTO.builder()
				.nodes(nodeData).build();

		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
		System.out.println(json);
		return json;
	}

	@GetMapping("/NetworkGlycoproteinRegulateChartFolderCytoscape")
	public String NetworkGlycoproteinRegulateChartFolderCytoscape() throws JsonProcessingException {
		List<CNodeData> nodeData = new ArrayList<>();
		CNodeData data = CNodeData.builder().
				id("Psmd7").
				foldChange(0.68).
				name("Psmd7").
				weight(0.0).
				color("#FFB8B8").
				protein("sp|P26516|PSMD7_MOUSE").
				build();
		nodeData.add(data);
		data = CNodeData.builder().
				id ("Capn1").
				foldChange(-1.23).
				name ("Capn1").
				weight(0.01).
				color("#8181FF").
				protein("sp|O35350|CAN1_MOUSE").
				build();
		nodeData.add(data);
		NetworkGlycoproteinRegulateChartFolderCytoscapeDTO inst = NetworkGlycoproteinRegulateChartFolderCytoscapeDTO.builder()
				.nodes(nodeData).build();

		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
		System.out.println(json);
		return json;
	}
	@GetMapping("/SearchedGlycoproteinIdentification")
	public String getSearchedGlycoproteinIdentification() throws JsonProcessingException {
		List<SearchedGlycoproteinIdentificationData> dataList = new ArrayList<>();
		dataList.add(SearchedGlycoproteinIdentificationData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		Id id1 = Id.builder().name("Unmatched_ions").color("#ADADAD").data(dataList).build();
		List<Id> idList = new ArrayList<>();
		idList.add(id1);
		HashMap<String,List<Id>> idmap = new HashMap<>();
		idmap.put("30526_30537", idList);
		Hcd hcd = Hcd.builder().id(idmap).build();
		List<Hcd> hcdList = new ArrayList<>();
		hcdList.add(hcd);
		SearchedGlycoproteinIdentificationDTO result = SearchedGlycoproteinIdentificationDTO.builder().hcd(hcdList).build();

		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
		System.out.println(json);

		return json;
	}

	@GetMapping("/venn")
	public String getVenn() throws JsonProcessingException {
		List<VennData> dataList = new ArrayList<>();
		dataList.add(VennData.builder()
				.name("<b>345</b><br>9.54%")
				.sets(new String[]{"1_1 Intensity"})
				.value(3189)
				.build());

		dataList.add(VennData.builder()
				.name("<b>424</b><br>11.73%")
				.sets(new String[]{"1_2 Intensity"})
				.value(3268)
				.build());

		dataList.add(VennData.builder()
				.name("<b>428</b><br>11.84%")
				.sets(new String[]{"1_3 Intensity"})
				.value(3272)
				.build());

		dataList.add(VennData.builder()
				.name("<b>103</b><br>81.5%")
				.sets(new String[]{"1_1 Intensity",
						"1_3 Intensity"})
				.value(2947)
				.build());

		dataList.add(VennData.builder()
				.name("<b>161</b><br>83.1%")
				.sets(new String[]{"1_2 Intensity", "1_3 Intensity"})
				.value(3005)
				.build());

		dataList.add(VennData.builder()
				.name("<b>161</b><br>83.1%")
				.sets(new String[]{"1_2 Intensity", "1_3 Intensity"})
				.value(3005)
				.build());

		dataList.add(VennData.builder()
				.name("<b>2844</b><br>78.65%")
				.sets(new String[]{"1_1 Intensity",
						"1_2 Intensity",
						"1_3 Intensity"})
				.value(2844)
				.build());

		VennDTO vdto = VennDTO.builder()
				.type("venn")
				.title("Group 1: The number of shared proteins")
				.vennData(dataList)
				.build();

		ObjectMapper objectMapper = new ObjectMapper();
		String vennJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(vdto);
		System.out.println(vennJson);
		return vennJson;
	}

//	@GetMapping("/userlist")
//	public String getUserlist() {
//		List<Chart> chartList = chartRepository.findAll();
//		System.out.println(chartList.size());
//		for (Chart i : chartList) System.out.println(">>>>" + i.getUser_id());
//		return "sr";
//	}
}
