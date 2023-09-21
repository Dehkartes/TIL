package study.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.server.service.StatisticsProteinService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/statistics/protein")
public class StatisticsProteinController {
	private final StatisticsProteinService statisticsProteinService;

	@GetMapping("/differentialtest/chart/folder/heatmap")
	public String getCFHeatmap() throws JsonProcessingException {
		return statisticsProteinService.getCFHeatmapJson();
	}

	@GetMapping("/differentialtest/chart/folder/scatter")
	public String getCFScatter() throws JsonProcessingException {
		return statisticsProteinService.getCFScatterJson();
	}

	@GetMapping("/normalization/chart/folder/afterboxplot2")
	public String getCFAfterboxplot2() throws JsonProcessingException {
		return statisticsProteinService.getCFAfterBoxPlot2Json();
	}

	@GetMapping("/normalization/chart/folder/beforeboxplot1")
	public String getCFBeforeboxplot1() throws JsonProcessingException {
		return statisticsProteinService.getCFBeforeBoxPlot1Json();
	}

	@GetMapping("/normalization/chart/group/afterboxplot2")
	public String getCGAfterboxplot2() throws JsonProcessingException {
		return statisticsProteinService.getCGAfterBoxPlot2Json();
	}

	@GetMapping("/normalization/chart/group/beforeboxplot1")
	public String getCGBeforeBoxplot1() throws JsonProcessingException {
		return statisticsProteinService.CGBeforeBoxplot1Json();
	}

	@GetMapping("/normalization/chart/single/aftercolumn2")
	public String getCSAfterColumn2() throws JsonProcessingException {
		return statisticsProteinService.getCSAfterColumn2Json();
	}

	@GetMapping("/normalization/chart/single/beforecolumn1")
	public String getCSBeforeColumn1() throws JsonProcessingException {
		return statisticsProteinService.getCSBeforeColumn1Json();
	}

	@GetMapping("/processing/chart/group/venn1")
	public String getCGVenn1() throws JsonProcessingException {
		return statisticsProteinService.getCGVenn1Json();
	}

	@GetMapping("/processing/chart/group/venn2")
	public String getCGVenn2() throws JsonProcessingException {
		return statisticsProteinService.getCGVenn2Json();
	}

	@GetMapping("/processing/chart/single/qqplotafter")
	public String getQqplotafter() throws JsonProcessingException {
		return statisticsProteinService.getCSQqplotAfterDTO();
	}

	@GetMapping("/processing/chart/single/qqplotbefore")
	public String getQqplotbefore() throws JsonProcessingException {
		return statisticsProteinService.getCSQqplotBeforeDTO();
	}
}
