package study.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.server.service.StatisticsGlycoproteinService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/statistics/glycoprotein")
public class StatisticsGlycoproteinController {
	private final StatisticsGlycoproteinService statisticsGlycoproteinService;

	@GetMapping("/differentialtest/chart/folder/column")
	public String getCFColumn() throws JsonProcessingException {
		return statisticsGlycoproteinService.getCFColumnJson();

	}

	@GetMapping("/differentialtest/chart/folder/heatmap")
	public String getCFHeatmap() throws JsonProcessingException {
		return statisticsGlycoproteinService.getCFHeatmapJson();
	}

	@GetMapping("/differentialtest/chart/folder/line")
	public String getCFLine() throws JsonProcessingException {
		return statisticsGlycoproteinService.getCFLineJson();
	}

	@GetMapping("/differentialtest/chart/folder/scatter")
	public String getCFScatter() throws JsonProcessingException {
		return statisticsGlycoproteinService.getCFScatterJson();
	}

	@GetMapping("/normalization/chart/folder/afterboxplot2")
	public String getCFAfterboxplot2() throws JsonProcessingException {
		return statisticsGlycoproteinService.getCFAfterBoxPlot2Json();
	}

	@GetMapping("/normalization/chart/folder/beforeboxplot1")
	public String getCFBeforeboxplot1() throws JsonProcessingException {
		return statisticsGlycoproteinService.getCFBeforeBoxPlot1Json();
	}

	@GetMapping("/normalization/chart/group/afterboxplot2")
	public String getCGAfterboxplot2() throws JsonProcessingException {
		return statisticsGlycoproteinService.getCGAfterBoxPlot2Json();
	}

	@GetMapping("/normalization/chart/group/beforeboxplot1")
	public String getCGBeforeBoxplot1() throws JsonProcessingException {
		return statisticsGlycoproteinService.CGBeforeBoxplot1Json();
	}

	@GetMapping("/normalization/chart/single/aftercolumn2")
	public String getCSAfterColumn2() throws JsonProcessingException {
		return statisticsGlycoproteinService.getCSAfterColumn2Json();
	}

	@GetMapping("/normalization/chart/single/beforecolumn1")
	public String getCSBeforeColumn1() throws JsonProcessingException {
		return statisticsGlycoproteinService.getCSBeforeColumn1Json();
	}

	@GetMapping("/processing/chart/group/venn")
	public String getCSCGVennSeriesElementDTO() throws JsonProcessingException {
		return statisticsGlycoproteinService.getCGVennJson();
	}
}
