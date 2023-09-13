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
public class NetworkGlycoproteinService extends JsonService {

	private final NetworkGlycoproteinRepository NetworkGlycoproteinRepository;

	public String getCCFCytoscapeJSON() throws JsonProcessingException {
		return getJsonString(NetworkGlycoproteinRepository.getCCFCytoscapeDTO());
	}

	public String getRCFCytoscapeJSON() throws JsonProcessingException {
		return getJsonString(NetworkGlycoproteinRepository.getRCFCytoscapeDTO());
	}
}
