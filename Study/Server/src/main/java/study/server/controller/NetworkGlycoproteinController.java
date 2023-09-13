package study.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.server.service.NetworkGlycoproteinService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/network/glycoprotein")
public class NetworkGlycoproteinController {

	private final NetworkGlycoproteinService networkGlycoproteinService;

	@GetMapping("/correlated/chart/folder/cytoscape")
	public String getCCFCytoscape() throws JsonProcessingException {
		return networkGlycoproteinService.getCCFCytoscapeJSON();
	}

	@GetMapping("/regulate/chart/folder/cytoscape")
	public String getRCFCytoscape() throws JsonProcessingException {
		return networkGlycoproteinService.getRCFCytoscapeJSON();
	}
}
