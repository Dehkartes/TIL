package study.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.server.service.SearchedProteinService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/searched/protein")
public class SearchedProteinController {
	private final SearchedProteinService searchedGlycoproteinService;
	@GetMapping("/identification/chart/row/histogram/")
	public String getCRHistogram() throws JsonProcessingException {
		return searchedGlycoproteinService.getICRHistogramJson();
	}

	@GetMapping("/identification/chart/row/sequence/")
	public String getICRSequence() throws JsonProcessingException {
		return searchedGlycoproteinService.getICRSequenceJson();
	}

	@GetMapping("/quantification/chart/row/bar/")
	public String getQCRBar() throws JsonProcessingException {
		return searchedGlycoproteinService.getQCRBarJson();
	}

	@GetMapping("/quantification/chart/row/position/")
	public String getQCRPosition() throws JsonProcessingException {
		return searchedGlycoproteinService.getQCRPositionJson();
	}
}
