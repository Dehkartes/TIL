package study.server.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderColumn.CFColumnDTO;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.CFHeatmapDTO;
import study.server.dto.statictics.glycoproteion.differentialtest.chatFolderLine.CFLineDTO;
import study.server.dto.statictics.glycoproteion.differentialtest.chatFolderScatter.CFScatterDTO;
import study.server.dto.statictics.glycoproteion.normalization.chartFolderAfterBoxplot2.CFAfterBoxPlot2DTO;
import study.server.dto.statictics.glycoproteion.normalization.chartFolderBeforeBoxplot1.CFBeforeBoxPlot1DTO;
import study.server.dto.statictics.glycoproteion.normalization.chartGroupAfterBoxplot2.CGAfterBoxPlot2DTO;
import study.server.repository.StatisticsGlycoproteinRepository;

@Service
@RequiredArgsConstructor
public class StatisticsGlycoproteinService {
	private final StatisticsGlycoproteinRepository statisticsGlycoproteinRepository;

	public String getCFColumnJson() throws JsonProcessingException {
		CFColumnDTO inst = statisticsGlycoproteinRepository.getCFColumnDTO();
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
	}

	public String getCFHeatmapJson() throws JsonProcessingException {
		CFHeatmapDTO inst = statisticsGlycoproteinRepository.getCFHeatmapDTO();
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
	}

	public String getCFLineJson() throws JsonProcessingException {
		CFLineDTO inst = statisticsGlycoproteinRepository.getCFLineDTO();
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
	}

	public String getCFScatterJson() throws JsonProcessingException {
		CFScatterDTO inst = statisticsGlycoproteinRepository.getCFScatterDTO();
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
	}

	public String getCFAfterBoxPlot2Json() throws JsonProcessingException {
		CFAfterBoxPlot2DTO inst = statisticsGlycoproteinRepository.getCFAfterBoxPlot2();
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
	}

	public String getCFBeforeBoxPlot1Json() throws JsonProcessingException {
		CFBeforeBoxPlot1DTO inst = statisticsGlycoproteinRepository.getCFBeforeBoxPlot1();
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
	}

	public String getCGAfterBoxPlot2Json() throws JsonProcessingException {
		CGAfterBoxPlot2DTO inst = statisticsGlycoproteinRepository.getCGAfterBoxPlot2();
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
	}
}
