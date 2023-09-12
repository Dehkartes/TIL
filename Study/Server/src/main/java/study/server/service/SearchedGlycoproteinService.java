package study.server.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.server.dto.searched.glycoprotein.identification.chartRowHistogram.CRHistogramDTO;
import study.server.repository.SearchedGlycoproteinRepository;

@Service
@RequiredArgsConstructor
public class SearchedGlycoproteinService {
	private final SearchedGlycoproteinRepository searchedGlycoproteinRepository;

	public String getCRHistogramJSON() throws JsonProcessingException {
		CRHistogramDTO inst = searchedGlycoproteinRepository.getCRHistogramDTO();
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
	}

}
