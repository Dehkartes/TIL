package study.server.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.server.dto.statictics.glycoprotein.differentialtest.chartFolderColumn.CFColumnDTO;
import study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap.CFHeatmapDTO;
import study.server.dto.statictics.glycoprotein.differentialtest.chatFolderLine.CFLineDTO;
import study.server.dto.statictics.glycoprotein.differentialtest.chatFolderScatter.CFScatterDTO;
import study.server.dto.statictics.glycoprotein.normalization.chartFolderAfterBoxplot2.CFAfterBoxPlot2DTO;
import study.server.dto.statictics.glycoprotein.normalization.chartFolderBeforeBoxplot1.CFBeforeBoxPlot1DTO;
import study.server.dto.statictics.glycoprotein.normalization.chartGroupAfterBoxplot2.CGAfterBoxPlot2DTO;
import study.server.dto.statictics.glycoprotein.normalization.chartGroupBeforeBoxplot1.CGBeforeBoxplot1DTO;
import study.server.dto.statictics.glycoprotein.normalization.chartSingleAfterColumn2.CSAfterColumn2DTO;
import study.server.dto.statictics.glycoprotein.normalization.chartSingleBeforeColumn1.CSBeforeColumn1DTO;
import study.server.dto.statictics.glycoprotein.processing.chartGroupVenn.CGVennDTO;
import study.server.repository.StatisticsGlycoproteinRepository;

@Service
@RequiredArgsConstructor
public class StatisticsGlycoproteinService extends JsonService {
	private final StatisticsGlycoproteinRepository statisticsGlycoproteinRepository;

	public String getCFColumnJson() throws JsonProcessingException {
		return getJsonString(statisticsGlycoproteinRepository.getCFColumnDTO());
	}

	public String getCFHeatmapJson() throws JsonProcessingException {
		return getJsonString(statisticsGlycoproteinRepository.getCFHeatmapDTO());
	}

	public String getCFLineJson() throws JsonProcessingException {
		return getJsonString(statisticsGlycoproteinRepository.getCFLineDTO());
	}

	public String getCFScatterJson() throws JsonProcessingException {
		return getJsonString(statisticsGlycoproteinRepository.getCFScatterDTO());
	}

	public String getCFAfterBoxPlot2Json() throws JsonProcessingException {
		return getJsonString(statisticsGlycoproteinRepository.getCFAfterBoxPlot2());
	}

	public String getCFBeforeBoxPlot1Json() throws JsonProcessingException {
		return getJsonString(statisticsGlycoproteinRepository.getCFBeforeBoxPlot1());
	}

	public String getCGAfterBoxPlot2Json() throws JsonProcessingException {
		return getJsonString(statisticsGlycoproteinRepository.getCGAfterBoxPlot2());
	}

	public String CGBeforeBoxplot1Json() throws JsonProcessingException {
		return getJsonString(statisticsGlycoproteinRepository.getCGBeforeBoxplot1DTO());
	}

	public String getCSAfterColumn2Json() throws JsonProcessingException {
		return getJsonString(statisticsGlycoproteinRepository.getCSAfterColumn2DTO());
	}

	public String getCSBeforeColumn1Json() throws JsonProcessingException {
		return getJsonString(statisticsGlycoproteinRepository.getCSBeforeColumn1DTO());
	}

	public String getCGVennJson() throws JsonProcessingException {
		return getJsonString(statisticsGlycoproteinRepository.getCGVennDTO());
	}
}
