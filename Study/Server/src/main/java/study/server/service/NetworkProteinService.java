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
public class NetworkProteinService {
	private final NetworkProteinRepository NetworkProteinRepository;

	public String getCCFCytoscapeJSON() throws JsonProcessingException {
		CCFCytoscapeDTO inst = NetworkProteinRepository.getCCFCytoscapeDTO();
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
	}

	public String getRCFcytoscapeJSON() throws JsonProcessingException {
		RCFCytoscapeDTO inst = NetworkProteinRepository.getRCFCytoscapeDTO();
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
	}
}
