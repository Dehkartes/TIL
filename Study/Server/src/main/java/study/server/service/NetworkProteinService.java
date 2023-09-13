package study.server.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.server.dto.network.protein.correlated.chartFolderCytoscape.CCFCytoscapeDTO;
import study.server.dto.network.protein.regulate.chartFolderCytoscape.RCFCytoscapeDTO;
import study.server.repository.NetworkProteinRepository;

@Service
@RequiredArgsConstructor
public class NetworkProteinService extends JsonService {
	private final NetworkProteinRepository NetworkProteinRepository;

	public String getCCFCytoscapeJSON() throws JsonProcessingException {
		return getJsonString(NetworkProteinRepository.getCCFCytoscapeDTO());
	}

	public String getRCFcytoscapeJSON() throws JsonProcessingException {
		return getJsonString(NetworkProteinRepository.getRCFCytoscapeDTO());
	}
}
