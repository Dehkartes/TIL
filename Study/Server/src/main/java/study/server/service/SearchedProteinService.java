package study.server.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.server.repository.SearchedProteinRepository;

@Service
@RequiredArgsConstructor
public class SearchedProteinService extends JsonService {
	private final SearchedProteinRepository searchedGlycoproteinRepository;

	public String getICRHistogramJson() throws JsonProcessingException {
		return getJsonString(searchedGlycoproteinRepository.getICRHistogramDTO());
	}
}
