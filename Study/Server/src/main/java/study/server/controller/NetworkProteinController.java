package study.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.server.dto.network.common.NodeData;
import study.server.dto.network.common.Nodes;
import study.server.dto.network.protein.correlated.chartFolderCytoscape.CCFCytoscapeDTO;
import study.server.dto.network.protein.regulate.chartFolderCytoscape.RCFCytoscapeDTO;
import study.server.repository.NetworkProteinRepository;
import study.server.service.NetworkProteinService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/network/protein")
public class NetworkProteinController {
	private final NetworkProteinService networkProteinService;
	@GetMapping("/correlated/chart/folder/cytoscape")
	public String getCCFCytoscape() throws JsonProcessingException {
		return networkProteinService.getCCFCytoscapeJSON();

	}

	@GetMapping("/regulate/chart/folder/cytoscape")
	public String getRegulateChartFolderCytoscape() throws JsonProcessingException {
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
		RCFCytoscapeDTO inst =
				RCFCytoscapeDTO.builder()
				.nodes(nodeData).build();

		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
		System.out.println(json);
		return json;
	}
}
