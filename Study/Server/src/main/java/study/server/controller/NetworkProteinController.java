package study.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.server.service.NetworkProteinService;

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
		return networkProteinService.getRCFcytoscapeJSON();
	}
}
