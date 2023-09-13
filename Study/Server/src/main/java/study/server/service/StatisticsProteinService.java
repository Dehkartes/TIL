package study.server.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.server.dto.statictics.protein.normalization.chartSingleAfterColumn2.CSAfterColumn2DTO;
import study.server.dto.statictics.protein.normalization.chartSingleBeforeColumn1.CSBeforeColumn1DTO;
import study.server.dto.statictics.protein.normalization.chartGroupAfterBoxplot2.CGAfterBoxPlot2DTO;
import study.server.dto.statictics.protein.normalization.chartGroupBeforeBoxplot1.CGBeforeBoxplot1DTO;
import study.server.dto.statictics.protein.normalization.chartFolderBeforeBoxplot1.CFBeforeBoxPlot1DTO;
import study.server.dto.statictics.protein.differentialtest.chatFolderScatter.CFScatterDTO;
import study.server.dto.statictics.protein.differentialtest.chartFolderHeatmap.CFHeatmapDTO;
import study.server.dto.statictics.protein.normalization.chartFolderAfterBoxplot2.CFAfterBoxPlot2DTO;
import study.server.dto.statictics.protein.processing.chartGroupVenn1.CGVenn1DTO;
import study.server.dto.statictics.protein.processing.chartGroupVenn2.CGVenn2DTO;
import study.server.dto.statictics.protein.processing.chartSingleQqplotAfter.CSQqplotAfterDTO;
import study.server.dto.statictics.protein.processing.chartSingleQqplotBefore.CSQqplotBeforeDTO;
import study.server.repository.StatisticsProteinRepository;

@Service
@RequiredArgsConstructor
public class StatisticsProteinService extends JsonService {
	private final StatisticsProteinRepository statisticsProteinRepository;

	public String getCFHeatmapJson() throws JsonProcessingException {
		return getJsonString(statisticsProteinRepository.getCFHeatmapDTO());
	}

	public String getCFScatterJson() throws JsonProcessingException {
		return getJsonString(statisticsProteinRepository.getCFScatterDTO());
	}

	public String getCFAfterBoxPlot2Json() throws JsonProcessingException {
		return getJsonString(statisticsProteinRepository.getCFAfterBoxPlot2());
	}

	public String getCFBeforeBoxPlot1Json() throws JsonProcessingException {
		return getJsonString(statisticsProteinRepository.getCFBeforeBoxPlot1());
	}

	public String getCGAfterBoxPlot2Json() throws JsonProcessingException {
		return getJsonString(statisticsProteinRepository.getCGAfterBoxPlot2());
	}

	public String CGBeforeBoxplot1Json() throws JsonProcessingException {
		return getJsonString(statisticsProteinRepository.getCGBeforeBoxplot1DTO());
	}

	public String getCSAfterColumn2Json() throws JsonProcessingException {
		return getJsonString(statisticsProteinRepository.getCSAfterColumn2DTO());
	}

	public String getCSBeforeColumn1Json() throws JsonProcessingException {
		return getJsonString(statisticsProteinRepository.getCSBeforeColumn1DTO());
	}

	public String getCGVenn1Json() throws JsonProcessingException {
		return getJsonString(statisticsProteinRepository.getCGVenn1DTO());
	}

	public String getCGVenn2Json() throws JsonProcessingException {
		return getJsonString(statisticsProteinRepository.getCGVenn2DTO());
	}

	public String getCSQqplotAfterDTO() throws JsonProcessingException {
		return getJsonString(statisticsProteinRepository.getCSQqplotAfterDTO());
	}

	public String getCSQqplotBeforeDTO() throws JsonProcessingException {
		return getJsonString(statisticsProteinRepository.getCSQqplotBeforeDTO());
	}
}
