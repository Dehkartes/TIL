package study.server.repository;

import org.springframework.stereotype.Repository;
import study.server.dto.searched.glycoprotein.identification.chartRowHistogram.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class SearchedGlycoproteinRepository {
	public  CRHistogramDTO getCRHistogramDTO() {
		List<CRHistogramData> dataListHcd1 = new ArrayList<>();
		dataListHcd1.add(CRHistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		dataListHcd1.add(CRHistogramData.builder().x(886.479).y(4.612093956261647).labels("None").build());
		Id idHcd1 = Id.builder().name("Unmatched_ions").color("#ADADAD").data(dataListHcd1).build();
		List<Id> idListHcd1 = new ArrayList<>();
		idListHcd1.add(idHcd1);
		List<CRHistogramData> dataListHcd2 = new ArrayList<>();
		dataListHcd2.add(CRHistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		dataListHcd2.add(CRHistogramData.builder().x(886.479).y(4.612093956261647).labels("None").build());
		Id idHcd2 = Id.builder().name("Matched_Large_Yions").color("#009394").data(dataListHcd2).build();
		idListHcd1.add(idHcd2);
		HashMap<String,List<Id>> idmapHcd1 = new HashMap<>();
		idmapHcd1.put("30526_30537", idListHcd1);

		List<CRHistogramData> dataListHcd12 = new ArrayList<>();
		dataListHcd12.add(CRHistogramData.builder().x( 1348.1824).y(1.5104112604608475).labels("None").build());
		dataListHcd12.add(CRHistogramData.builder().x(1771.9531).y(19.975499289335513).labels("None").build());
		Id idHcd12 = Id.builder().name("Unmatched_ions").color("#ADADAD").data(dataListHcd12).build();
		List<Id> idListHcd12 = new ArrayList<>();
		idListHcd12.add(idHcd12);
		List<CRHistogramData> dataListHcd22 = new ArrayList<>();
		dataListHcd22.add(CRHistogramData.builder().x(1164.6149).y(2.146956989125754).labels(" 1164.615(PEP+HexNAc(1)_2)").build());
		dataListHcd22.add(CRHistogramData.builder().x(1164.6149).y(2.146956989125754).labels(" 1266.153(PEP+HexNAc(2)_2)").build());
		Id idHcd22 = Id.builder().name("Matched_Large_Yions").color("#009394").data(dataListHcd22).build();
		idListHcd12.add(idHcd22);
		idmapHcd1.put("34106_34113", idListHcd12);

		Hcd hcd = Hcd.builder().id(idmapHcd1).build();
		List<Hcd> hcdList = new ArrayList<>();
		hcdList.add(hcd);

		List<CRHistogramData> dataListCid1 = new ArrayList<>();
		dataListCid1.add(CRHistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		dataListCid1.add(CRHistogramData.builder().x(886.479).y(4.612093956261647).labels("None").build());
		Id idHcd13 = Id.builder().name("Unmatched_ions").color("#ADADAD").data(dataListCid1).build();
		List<Id> idListHcd13 = new ArrayList<>();
		idListHcd13.add(idHcd13);
		List<CRHistogramData> dataListHcd23 = new ArrayList<>();
		dataListHcd23.add(CRHistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		dataListHcd23.add(CRHistogramData.builder().x(886.479).y(4.612093956261647).labels("None").build());
		Id idHcd222 = Id.builder().name("Matched_Large_Yions").color("#009394").data(dataListHcd23).build();
		idListHcd1.add(idHcd222);
		HashMap<String,List<Id>> idmapCid = new HashMap<>();
		idmapCid.put("30526_30537", idListHcd1);

		List<CRHistogramData> dataListHcd123 = new ArrayList<>();
		dataListHcd123.add(CRHistogramData.builder().x( 1348.1824).y(1.5104112604608475).labels("None").build());
		dataListHcd123.add(CRHistogramData.builder().x(1771.9531).y(19.975499289335513).labels("None").build());
		Id idHcd123 = Id.builder().name("Unmatched_ions").color("#ADADAD").data(dataListHcd12).build();
		List<Id> idListHcd123 = new ArrayList<>();
		idListHcd123.add(idHcd123);
		List<CRHistogramData> dataListHcd222 = new ArrayList<>();
		dataListHcd222.add(CRHistogramData.builder().x(1164.6149).y(2.146956989125754).labels(" 1164.615(PEP+HexNAc(1)_2)").build());
		dataListHcd222.add(CRHistogramData.builder().x(1164.6149).y(2.146956989125754).labels(" 1266.153(PEP+HexNAc(2)_2)").build());
		Id idHcd223 = Id.builder().name("Matched_Large_Yions").color("#009394").data(dataListHcd22).build();
		idListHcd123.add(idHcd223);
		idmapCid.put("34106_34113", idListHcd123);

		Cid cid = Cid.builder().id(idmapCid).build();
		List<Cid> cidList = new ArrayList<>();
		cidList.add(cid);

		List<CRHistogramData> dataListhcd1 = new ArrayList<>();
		dataListhcd1.add(CRHistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		dataListhcd1.add(CRHistogramData.builder().x(886.479).y(4.612093956261647).labels("None").build());
		Id idEtd13 = Id.builder().name("Unmatched_ions").color("#ADADAD").data(dataListCid1).build();
		List<Id> idListEtd13 = new ArrayList<>();
		idListEtd13.add(idEtd13);
		List<CRHistogramData> dataListEtd23 = new ArrayList<>();
		dataListEtd23.add(CRHistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		dataListEtd23.add(CRHistogramData.builder().x(886.479).y(4.612093956261647).labels("None").build());
		Id idEtd222 = Id.builder().name("Matched_Large_Yions").color("#009394").data(dataListHcd23).build();
		idListHcd1.add(idEtd222);
		HashMap<String,List<Id>> idmapEtd = new HashMap<>();
		idmapEtd.put("30526_30537", idListHcd1);

		List<CRHistogramData> dataListETd123 = new ArrayList<>();
		dataListETd123.add(CRHistogramData.builder().x( 1348.1824).y(1.5104112604608475).labels("None").build());
		dataListETd123.add(CRHistogramData.builder().x(1771.9531).y(19.975499289335513).labels("None").build());
		Id idETd123 = Id.builder().name("Unmatched_ions").color("#ADADAD").data(dataListHcd12).build();
		List<Id> idListEtd123 = new ArrayList<>();
		idListEtd123.add(idETd123);
		List<CRHistogramData> dataListEtd222 = new ArrayList<>();
		dataListEtd222.add(CRHistogramData.builder().x(1164.6149).y(2.146956989125754).labels(" 1164.615(PEP+HexNAc(1)_2)").build());
		dataListEtd222.add(CRHistogramData.builder().x(1164.6149).y(2.146956989125754).labels(" 1266.153(PEP+HexNAc(2)_2)").build());
		Id idEtd223 = Id.builder().name("Matched_Large_Yions").color("#009394").data(dataListHcd22).build();
		idListEtd123.add(idEtd223);
		idmapEtd.put("34106_34113", idListEtd123);

		Etd etd = Etd.builder().id(idmapEtd).build();
		List<Etd> etdList = new ArrayList<>();
		etdList.add(etd);


		CRHistogramDTO result = CRHistogramDTO.builder().hcd(hcdList).cid(cidList).etd(etdList).build();
		return result;
	}
}
