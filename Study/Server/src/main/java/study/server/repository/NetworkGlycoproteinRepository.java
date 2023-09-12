package study.server.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Repository;
import study.server.dto.network.common.NodeData;
import study.server.dto.network.common.Nodes;
import study.server.dto.network.glycoprotein.correlated.chartFolderCytoscape.CCFCytoscapeDTO;
import study.server.dto.network.glycoprotein.regulate.chartFolderCytoscapeDTO.RCFCytoscapeDTO;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NetworkGlycoproteinRepository {

	public CCFCytoscapeDTO getCCFCytoscapeDTO() throws JsonProcessingException {
		List<Nodes> nodeData = new ArrayList<>();
		NodeData data = NodeData.builder().
				id("Psmd7").
				foldChange(0.68).
				name("Psmd7").
				weight(0.0).
				color("#FFB8B8").
				protein("sp|P26516|PSMD7_MOUSE").
				build();
		Nodes nod = Nodes.builder().
				data(data).
				build();

		nodeData.add(nod);

		NodeData data2 = NodeData.builder().
				id("Capn1").
				foldChange(-1.23).
				name("Capn1").
				weight(0.01).
				color("#8181FF").
				protein("sp|O35350|CAN1_MOUSE").
				build();
		Nodes nod2 = Nodes.builder().
				data(data2).
				build();

		nodeData.add(nod2);

		CCFCytoscapeDTO inst =
				CCFCytoscapeDTO
						.builder()
						.nodes(nodeData)
						.build();
		return inst;
	}

	public RCFCytoscapeDTO getRCFCytoscapeDTO() throws JsonProcessingException {
		List<Nodes> nodeData = new ArrayList<>();
		NodeData data = NodeData.builder().
				id("Psmd7").
				foldChange(0.68).
				name("Psmd7").
				weight(0.0).
				color("#FFB8B8").
				protein("sp|P26516|PSMD7_MOUSE").
				build();
		Nodes nod = Nodes
				.builder()
				.data(data)
				.build();

		nodeData.add(nod);

		NodeData data2 = NodeData.builder().
				id("Capn1").
				foldChange(-1.23).
				name("Capn1").
				weight(0.01).
				color("#8181FF").
				protein("sp|O35350|CAN1_MOUSE").
				build();
		Nodes nod2 = Nodes.builder().
				data(data2).
				build();

		nodeData.add(nod2);

		RCFCytoscapeDTO inst = RCFCytoscapeDTO
				.builder()
				.nodes(nodeData)
				.build();

		return inst;
	}
}
