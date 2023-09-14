package study.server.repository;

import org.springframework.stereotype.Repository;
import study.server.dto.searched.element.*;
import study.server.dto.searched.glycoprotein.identification.chartRowHistogram.*;
import study.server.dto.searched.glycoprotein.identification.chartRowPosition.CRPositionDTO;
import study.server.dto.searched.glycoprotein.identification.chartRowPosition.CRPositionData1Element;
import study.server.dto.searched.glycoprotein.quantification.chartRowBar.CRBarDTO;
import study.server.dto.searched.glycoprotein.quantification.Element.CRDetailOther;
import study.server.dto.searched.glycoprotein.quantification.Element.CRDetailPrimary;
import study.server.dto.searched.glycoprotein.quantification.Element.CRPrimaryDataLabels;
import study.server.dto.searched.glycoprotein.quantification.chartRowPosition.QCRPositionDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class SearchedGlycoproteinRepository {
	public CRHistogramDTO getCRHistogramDTO() {
		List<HistogramData> dataListHcd1 = new ArrayList<>();
		dataListHcd1.add(HistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		dataListHcd1.add(HistogramData.builder().x(886.479).y(4.612093956261647).labels("None").build());
		HistogramElement idHcd1 = HistogramElement.builder().name("Unmatched_ions").color("#ADADAD").data(dataListHcd1).build();
		List<HistogramElement> idListHcd1 = new ArrayList<>();
		idListHcd1.add(idHcd1);
		List<HistogramData> dataListHcd2 = new ArrayList<>();
		dataListHcd2.add(HistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		dataListHcd2.add(HistogramData.builder().x(886.479).y(4.612093956261647).labels("None").build());
		HistogramElement idHcd2 = HistogramElement.builder().name("Matched_Large_Yions").color("#009394").data(dataListHcd2).build();
		idListHcd1.add(idHcd2);
		HashMap<String,List<HistogramElement>> idmapHcd1 = new HashMap<>();
		idmapHcd1.put("30526_30537", idListHcd1);

		List<HistogramData> dataListHcd12 = new ArrayList<>();
		dataListHcd12.add(HistogramData.builder().x( 1348.1824).y(1.5104112604608475).labels("None").build());
		dataListHcd12.add(HistogramData.builder().x(1771.9531).y(19.975499289335513).labels("None").build());
		HistogramElement idHcd12 = HistogramElement.builder().name("Unmatched_ions").color("#ADADAD").data(dataListHcd12).build();
		List<HistogramElement> idListHcd12 = new ArrayList<>();
		idListHcd12.add(idHcd12);
		List<HistogramData> dataListHcd22 = new ArrayList<>();
		dataListHcd22.add(HistogramData.builder().x(1164.6149).y(2.146956989125754).labels(" 1164.615(PEP+HexNAc(1)_2)").build());
		dataListHcd22.add(HistogramData.builder().x(1164.6149).y(2.146956989125754).labels(" 1266.153(PEP+HexNAc(2)_2)").build());
		HistogramElement idHcd22 = HistogramElement.builder().name("Matched_Large_Yions").color("#009394").data(dataListHcd22).build();
		idListHcd12.add(idHcd22);
		idmapHcd1.put("34106_34113", idListHcd12);

		Hcd hcd = Hcd.builder().id(idmapHcd1).build();
		List<Hcd> hcdList = new ArrayList<>();
		hcdList.add(hcd);

		List<HistogramData> dataListCid1 = new ArrayList<>();
		dataListCid1.add(HistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		dataListCid1.add(HistogramData.builder().x(886.479).y(4.612093956261647).labels("None").build());
		HistogramElement idHcd13 = HistogramElement.builder().name("Unmatched_ions").color("#ADADAD").data(dataListCid1).build();
		List<HistogramElement> idListHcd13 = new ArrayList<>();
		idListHcd13.add(idHcd13);
		List<HistogramData> dataListHcd23 = new ArrayList<>();
		dataListHcd23.add(HistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		dataListHcd23.add(HistogramData.builder().x(886.479).y(4.612093956261647).labels("None").build());
		HistogramElement idHcd222 = HistogramElement.builder().name("Matched_Large_Yions").color("#009394").data(dataListHcd23).build();
		idListHcd1.add(idHcd222);
		HashMap<String,List<HistogramElement>> idmapCid = new HashMap<>();
		idmapCid.put("30526_30537", idListHcd1);

		List<HistogramData> dataListHcd123 = new ArrayList<>();
		dataListHcd123.add(HistogramData.builder().x( 1348.1824).y(1.5104112604608475).labels("None").build());
		dataListHcd123.add(HistogramData.builder().x(1771.9531).y(19.975499289335513).labels("None").build());
		HistogramElement idHcd123 = HistogramElement.builder().name("Unmatched_ions").color("#ADADAD").data(dataListHcd12).build();
		List<HistogramElement> idListHcd123 = new ArrayList<>();
		idListHcd123.add(idHcd123);
		List<HistogramData> dataListHcd222 = new ArrayList<>();
		dataListHcd222.add(HistogramData.builder().x(1164.6149).y(2.146956989125754).labels(" 1164.615(PEP+HexNAc(1)_2)").build());
		dataListHcd222.add(HistogramData.builder().x(1164.6149).y(2.146956989125754).labels(" 1266.153(PEP+HexNAc(2)_2)").build());
		HistogramElement idHcd223 = HistogramElement.builder().name("Matched_Large_Yions").color("#009394").data(dataListHcd22).build();
		idListHcd123.add(idHcd223);
		idmapCid.put("34106_34113", idListHcd123);

		Cid cid = Cid.builder().id(idmapCid).build();
		List<Cid> cidList = new ArrayList<>();
		cidList.add(cid);

		List<HistogramData> dataListhcd1 = new ArrayList<>();
		dataListhcd1.add(HistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		dataListhcd1.add(HistogramData.builder().x(886.479).y(4.612093956261647).labels("None").build());
		HistogramElement idEtd13 = HistogramElement.builder().name("Unmatched_ions").color("#ADADAD").data(dataListCid1).build();
		List<HistogramElement> idListEtd13 = new ArrayList<>();
		idListEtd13.add(idEtd13);
		List<HistogramData> dataListEtd23 = new ArrayList<>();
		dataListEtd23.add(HistogramData.builder().x(789.0391).y(3.76273215877882).labels("None").build());
		dataListEtd23.add(HistogramData.builder().x(886.479).y(4.612093956261647).labels("None").build());
		HistogramElement idEtd222 = HistogramElement.builder().name("Matched_Large_Yions").color("#009394").data(dataListHcd23).build();
		idListHcd1.add(idEtd222);
		HashMap<String,List<HistogramElement>> idmapEtd = new HashMap<>();
		idmapEtd.put("30526_30537", idListHcd1);

		List<HistogramData> dataListETd123 = new ArrayList<>();
		dataListETd123.add(HistogramData.builder().x( 1348.1824).y(1.5104112604608475).labels("None").build());
		dataListETd123.add(HistogramData.builder().x(1771.9531).y(19.975499289335513).labels("None").build());
		HistogramElement idETd123 = HistogramElement.builder().name("Unmatched_ions").color("#ADADAD").data(dataListHcd12).build();
		List<HistogramElement> idListEtd123 = new ArrayList<>();
		idListEtd123.add(idETd123);
		List<HistogramData> dataListEtd222 = new ArrayList<>();
		dataListEtd222.add(HistogramData.builder().x(1164.6149).y(2.146956989125754).labels(" 1164.615(PEP+HexNAc(1)_2)").build());
		dataListEtd222.add(HistogramData.builder().x(1164.6149).y(2.146956989125754).labels(" 1266.153(PEP+HexNAc(2)_2)").build());
		HistogramElement idEtd223 = HistogramElement.builder().name("Matched_Large_Yions").color("#009394").data(dataListHcd22).build();
		idListEtd123.add(idEtd223);
		idmapEtd.put("34106_34113", idListEtd123);

		Etd etd = Etd.builder().id(idmapEtd).build();
		List<Etd> etdList = new ArrayList<>();
		etdList.add(etd);


		CRHistogramDTO result = CRHistogramDTO.builder().hcd(hcdList).cid(cidList).etd(etdList).build();
		return result;
	}

	public CRPositionDTO getCRPositionDTO() {
		List<CRPositionData1Element> data1 = new ArrayList<>();
		HashMap<String, List<Detail>> data1Element = new HashMap<>();
		List<Detail> datailList = new ArrayList<>();
		datailList.add(Detail.builder()
						.x(0)
						.color("#006360")
						.dataLabels(DataLabels.builder()
								.enabled("true")
								.connectorColor("false")
								.connectorWidth("false")
								.borderWidth(0)
								.useHTML("true")
								.format("<span class='title'>Signal Peptide=18<b class='tri-first' style='left:18px'></b></span>")
								.build())
						.marker(Marker.builder()
								.symbol("square")
								.radius(21)
								.build())
						.build());

		datailList.add(Detail.builder()
					.x(33)
					.color("#ff6c6c")
					.description("H5N4F0S2 H6N5F0S3 H6N5F1S2")
					.dataLabels(DataLabels.builder()
							.enabled("true")
							.connectorColor("false")
							.connectorWidth("false")
							.format("<span class='title'>Signal Peptide=18<b class='tri-first' style='left:18px'></b></span>")
							.build())
					.build());
		data1Element.put("P02763", datailList);
		data1.add(CRPositionData1Element.builder()
						.data1Element(data1Element)
				.build());

		HashMap<String, List<Detail>> data1Element1 = new HashMap<>();
		List<Detail> datailList1 = new ArrayList<>();
		datailList1.add(Detail.builder()
				.x(0)
				.color("#006360")
				.dataLabels(DataLabels.builder()
						.enabled("true")
						.connectorColor("false")
						.connectorWidth("false")
						.borderWidth(0)
						.useHTML("true")
						.format("<span class='title'>Signal Peptide=18<b class='tri-first' style='left:18px'></b></span>")
						.build())
				.marker(Marker.builder()
						.symbol("square")
						.radius(21)
						.build())
				.build());

		datailList1.add(Detail.builder()
				.x(33)
				.color("#ff6c6c")
				.description("H5N4F0S2 H6N5F0S3 H6N5F1S2")
				.dataLabels(DataLabels.builder()
						.enabled("true")
						.connectorColor("false")
						.connectorWidth("false")
						.format("<span class='title'>Signal Peptide=18<b class='tri-first' style='left:18px'></b></span>")
						.build())
				.build());
		data1Element1.put("P19652", datailList1);
		data1.add(CRPositionData1Element.builder()
				.data1Element(data1Element1)
				.build());

		return CRPositionDTO.builder()
				.data1(data1)
				.build();
	}

	public CRBarDTO getCRBarDTO() {
		HashMap<String, List<String>> xAxis = new HashMap<>();
		List<String> xAxisElementList = new ArrayList<>();
		xAxisElementList.add("H6N5F0S2");
		xAxisElementList.add("H6N5F0S2");
		xAxis.put("P02763", xAxisElementList);
		HashMap<String, List<Object>> data1 = new HashMap<>();
		List<Object> data1value = new ArrayList<>();
		data1value.add(CRDetailPrimary.builder()
						.name("18")
						.dataLabels(CRPrimaryDataLabels.builder()
								.enabled(true)
								.connectorColor("false")
								.connectorWidth("false")
								.borderWidth(0)
								.useHTML(true)
								.format("<span class='title'>Signal Peptide=18<b class='tri-first' style='left:18px'></b></span>")
								.description("H3N3F0S0 H4N3F0S0")
								.x(0)
								.y(45)
								.build())
						.color("#0006360")
						.colorIndex(98)
						.marker(Marker.builder()
								.symbol("square")
								.radius(21)
								.build())
						.build());
		data1value.add(CRDetailOther.builder()
						.x(33)
						.name("33")
						.color("#ff6c6c")
						.colorIndex(0)
						.description("H3N3F0S0 H4N3F0S0")
						.dataLabels(DataLabels.builder()
								.enabled("true")
								.connectorColor("false")
								.connectorWidth("false")
								.format("<span style='color: white'>33</span>")
								.y(0)
								.build())
						.build());
		data1.put("P02763_information", data1value);
		HashMap<String, List<Object>> data2 = new HashMap<>();
		List<Object> data2value = new ArrayList<>();
		List<Integer>l1 = new ArrayList<>();
		l1.add(10);
		l1.add(0);
		data2value.add(CRDetailOther.builder()
						.name("33")
						.data(l1)
						.colorIndex(0)
				.build());
		List<Integer> l2 = new ArrayList<>();
		l2.add(15);
		l2.add(100);
		data2value.add(CRDetailOther.builder()
				.name("56")
				.data(l1)
				.colorIndex(1)
				.build());
		data2.put("P0763", data2value);
		return CRBarDTO.builder()
				.stack_bar(GlyQuantiCRStackBar.builder()
						.xAxis(xAxis)
						.build())
				.data1(data1)
				.data2(data2)
				.build();
	}

	public QCRPositionDTO getQCRPositionDTO() {
		HashMap<String, List<String>> xAxis = new HashMap<>();
		List<String> xAxisElementList = new ArrayList<>();
		xAxisElementList.add("H6N5F0S2");
		xAxisElementList.add("H6N5F0S2");
		xAxis.put("P02763", xAxisElementList);
		HashMap<String, List<Object>> data1 = new HashMap<>();
		List<Object> data1value = new ArrayList<>();
		data1value.add(CRDetailPrimary.builder()
				.name("18")
				.dataLabels(CRPrimaryDataLabels.builder()
						.enabled(true)
						.connectorColor("false")
						.connectorWidth("false")
						.borderWidth(0)
						.useHTML(true)
						.format("<span class='title'>Signal Peptide=18<b class='tri-first' style='left:18px'></b></span>")
						.description("H3N3F0S0 H4N3F0S0")
						.x(0)
						.y(45)
						.build())
				.color("#0006360")
				.colorIndex(98)
				.marker(Marker.builder()
						.symbol("square")
						.radius(21)
						.build())
				.build());
		data1value.add(CRDetailOther.builder()
				.x(33)
				.name("33")
				.color("#ff6c6c")
				.colorIndex(0)
				.description("H3N3F0S0 H4N3F0S0")
				.dataLabels(DataLabels.builder()
						.enabled("true")
						.connectorColor("false")
						.connectorWidth("false")
						.format("<span style='color: white'>33</span>")
						.y(0)
						.build())
				.build());
		data1.put("P02763_information", data1value);
		HashMap<String, List<Object>> data2 = new HashMap<>();
		List<Object> data2value = new ArrayList<>();
		List<Integer>l1 = new ArrayList<>();
		l1.add(10);
		l1.add(0);
		data2value.add(CRDetailOther.builder()
				.name("33")
				.data(l1)
				.colorIndex(0)
				.build());
		List<Integer> l2 = new ArrayList<>();
		l2.add(15);
		l2.add(100);
		data2value.add(CRDetailOther.builder()
				.name("56")
				.data(l1)
				.colorIndex(1)
				.build());
		data2.put("P0763", data2value);
		return QCRPositionDTO.builder()
				.stack_bar(GlyQuantiCRStackBar.builder()
						.xAxis(xAxis)
						.build())
				.data1(data1)
				.data2(data2)
				.build();
	}
}
