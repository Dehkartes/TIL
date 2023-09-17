package study.server.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.server.repository.SearchedProteinRepository;

@Service
@RequiredArgsConstructor
public class SearchedProteinService extends JsonService {
	private final SearchedProteinRepository searchedProteinRepository;

	public String getICRHistogramJson() throws JsonProcessingException {
		return getJsonString(searchedProteinRepository.getICRHistogramDTO());
	}

	public String getICRSequenceJson() throws JsonProcessingException {
		return getJsonString(searchedProteinRepository.getICRSequenceDTO());
	}

	public String getQCRBarJson() throws JsonProcessingException {
		return getJsonString(searchedProteinRepository.getQCRBarDTO());
	}

	public String getQCRPositionJson() throws JsonProcessingException {
		return getJsonString(searchedProteinRepository.getQCRPosition());
	}
}
