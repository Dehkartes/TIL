package study.server.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.server.dto.network.glycoprotein.correlated.chartFolderCytoscape.CCFCytoscapeDTO;
import study.server.dto.network.glycoprotein.regulate.chartFolderCytoscapeDTO.RCFCytoscapeDTO;
import study.server.repository.NetworkGlycoproteinRepository;

@Service
@RequiredArgsConstructor
public class NetworkGlycoproteinService {

	private final NetworkGlycoproteinRepository NetworkGlycoproteinRepository;

	public String getCCFCytoscapeJSON() throws JsonProcessingException {
		CCFCytoscapeDTO inst = NetworkGlycoproteinRepository.getCCFCytoscapeDTO();
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
	}

	public String getRCFCytoscapeJSON() throws JsonProcessingException {
		RCFCytoscapeDTO inst = NetworkGlycoproteinRepository.getRCFCytoscapeDTO();
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
	}
}
