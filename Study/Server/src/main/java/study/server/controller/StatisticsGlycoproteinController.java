package study.server.controller;

import ch.qos.logback.classic.spi.IThrowableProxy;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.server.dto.statictics.glycoproteion.common.Chart;
import study.server.dto.statictics.glycoproteion.common.Title;
import study.server.dto.statictics.glycoproteion.common.XAxis;
import study.server.dto.statictics.glycoproteion.common.YAxis;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderColumn.*;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.CFHeatmapDTO;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.ColorAxis;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.ColorAxisLabels;
import study.server.repository.StatisticsGlycoproteinRepository;
import study.server.service.StatisticsGlycoproteinService;

import java.util.ArrayList;
import java.util.List;

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
}
