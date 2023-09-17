package study.server.repository;

import org.springframework.stereotype.Repository;
import study.server.dto.searched.element.*;
import study.server.dto.searched.protein.identification.chartRowHistogram.ICRHistogramDTO;
import study.server.dto.searched.protein.identification.chartRowSequence.ICRSequenceDTO;
import study.server.dto.searched.protein.identification.chartRowSequence.ICRSequenceData1;
import study.server.dto.searched.protein.identification.chartRowSequence.ICRSequenceData2;
import study.server.dto.searched.protein.identification.chartRowSequence.ICRSequenceHead;
import study.server.dto.searched.protein.quantification.chartRowBar.QCRBarDTO;
import study.server.dto.searched.protein.quantification.chartRowPosition.QCRPositionDTO;
import study.server.dto.searched.protein.quantification.chartRowPosition.QCRPositionDataLabels;
import study.server.dto.searched.protein.quantification.chartRowPosition.QCRPositionElement;
import study.server.dto.searched.protein.quantification.chartRowPosition.QCRPositionMarker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class SearchedProteinRepository {

	public ICRHistogramDTO getICRHistogramDTO() {
		List<HashMap<String, List<HistogramElement>>> hcd = new ArrayList<>();
		HashMap<String, List<HistogramElement>> hcdelement = new HashMap<>();
		List<HistogramElement> value = new ArrayList<>();
		List<HistogramData> data = new ArrayList<>();
		data.add(HistogramData.builder()
						.x(147.11251831054688)
						.y(50.08677284103419)
						.labels("147.113(y1(+1))")
				.build());
		data.add(HistogramData.builder()
				.x(218.1498260498047)
				.y(33.73819472460976)
				.labels(" 218.150(y2(+1))")
				.build());
		value.add(HistogramElement.builder()
						.name("Unmatched_ions")
						.color("#ADADAD")
						.data(data)
				.build());
		hcdelement.put("9062", value);

		List<HistogramElement> value2 = new ArrayList<>();
		List<HistogramData> data2 = new ArrayList<>();
		data2.add(HistogramData.builder()
				.x(147.11251831054688)
				.y(50.08677284103419)
				.labels("147.113(y1(+1))")
				.build());
		data2.add(HistogramData.builder()
				.x(218.1498260498047)
				.y(33.73819472460976)
				.labels(" 218.150(y2(+1))")
				.build());
		value2.add(HistogramElement.builder()
				.name("Unmatched_ions")
				.color("#ADADAD")
				.data(data2)
				.build());
		hcdelement.put("9828", value2);

		hcd.add(hcdelement);
		hcd.add(hcdelement);
		return ICRHistogramDTO.builder()
				.hcd(hcd)
				.build();
	}

	public ICRSequenceDTO getICRSequenceDTO() {
		List<Object> proteinSequence = new ArrayList<>();
		HashMap<String, ICRSequenceHead> head = new HashMap<>();
		head.put("head", ICRSequenceHead.builder()
				.type("chart")
				.title("Protein Identification")
				.data1("protein_sequence")
				.data2("peptide_identification")
				.build());
		proteinSequence.add(head);

		HashMap<String, Integer> proteinLength = new HashMap<>();
		proteinLength.put("A2A432", 970);
		proteinLength.put("A2A5R2", 1792);
		HashMap<String, String> proteinSequencesub = new HashMap<>();
		proteinSequencesub.put("A2A432", "MSRSTRSKERRENDTDSEDNSSETSNQERRRCRQGPPRPPYPPLLPPVFPPPTPPPQVRRTRGLQDLGAMKSVCPGTSGFSSPNPSAASAAAQEVRSATDGNTSTTPPTSAKKRKLNSSSSSSNSSNEREDFDSTSSSSTPPQPRDSASPSTSSFCLGVPVATSSHVPIQKKLRFEDTLEFVGIDTKMAEESSSSSSSSSPTAATSQQQQQQQLKTKSILISSVASVHHANGLAKSSTAVSSFANSKPGSAKKLVIKNFKDKPKLPENYTDETWQKLKEAVEAIQNSTSIKYNLEELYQAVENLCSHKISANLYKQLRQICEDHIKAQIHQFREDSLDSVLFLKKIDRCWQNHCRQMIMIRSIFLFLDRTYVLQNSMLPSIWDMGLELFRAHIISDQKVQTKTIDGILLLIERERNGEAIDRSLLRSLLSMLSDLQIYQDSFEQQFLQETNRLYAAEGQKLMQEREVPEYLHHVNKRLEEEADRLITYLDQTTQKSLIASVEKQLLGEHLTAILQKGLNSLLDENRIQDLSLLYQLFSRVRGGVQVLLQQWIEYIKAFGSTIVINPEKDKTMVQELLDFKDKVDHIIDTCFLKNEKFINAMKEAFETFINKRPNKPAELIAKYVDSKLRAGNKEATDEELEKMLDKIMIIFRFIYGKDVFEAFYKKDLAKRLLVGKSASVDAEKSMLSKLKHECGAAFTSKLEGMFKDMELSKDIMIQFKQYMQNQNVPGNIELTVNILTMGYWPTYVPMEVHLPPEMVKLQEIFKTFYLGKHSGRKLQWQSTLGHCVLKAEFKEGKKELQVSLFQTMVLLMFNEGEEFSLEEIKHATGIEDGELRRTLQSLACGKARVLAKNPKGKDIEDGDKFICNDDFKHKLFRIKINQIQMKETVEEQASTTERVFQDRQYQIDAAIVRIMKMRKTLSHNLLVSEVYNQLKFPVKPADLKKRIESLIDRDYMERDKENPNQYNYIA");
		proteinSequencesub.put("A2A5R2", "MQESQTKSMFVSRALEKILADKEVKRPQHSQLRRACQVALDEIKAELEKQRLGAAAPPKANFIEADKYFLPFELACQSKSPRVVSTSLDCLQKLIAYGHITGNAPDSGAPGKRLIDRIVETICNCFQGPQTDEGVQLQIIKALLTAVTSPHIEIHEGTILQTVRTCYNIYLASKNLINQTTAKATLTQMLNVIFTRMENQVLQEARELEKPMQSKPQSPVIQATAGSPKFSRLKQSQAQSKPTTPEKAELPNGDHAQSGLGKVSLENGEAPRERGSPVSGRAEPSRGTDSGAQEVVKDILEDVVTSAVKEAAEKHGLPEPDRALGALECQECAVPPGVDENSQTNGIADDRQSLSSADNLEPDVQGHQVAARFSHILQKDAFLVFRSLCKLSMKPLGEGPPDPKSHELRSKVVSLQLLLSVLQNAGPVFRSHEMFVTAIKQYLCVALSKNGVSSVPDVFELSLAIFLTLLSNFKMHLKMQIEVFFKEIFLNILETSTSSFEHRWMVIQTLTRICADAQCVVDIYVNYDCDLNAANIFERLVNDLSKIAQGRSGHELGMTPLQELSLRKKGLECLVSILKCMVEWSKDLYVNPNHQATLGQERLPDQEMGDGKGLDMARRCSVTSVESTVSSGTQTAIQDDPEQFEVIKQQKEIIEHGIELFNKKPKRGIQFLQEQGMLGAAVEDIAQFLHQEERLDSTQVGEFLGDSTRFNKEVMYAYVDQLDFCEKEFVSALRTFLEGFRLPGEAQKIDRLMEKFAARYIECNQGQTLFASADTAYVLAYSIIMLTTDLHSPQVKNKMTKEQYIKMNRGINDSKDLPEEYLSSIYDEIEGKKIAMKETKEHTIATKSTKQSVASEKQRRLLYNVEMEQMAKTAKALMEAVSHAKAPFTSATHLDHVRPMFKLVWTPLLAAYSIGLQNCDDTEVASLCLEGIRCAVRIACIFGMQLERDAYVQALARFSLLTASSSITEMKQKNIDTIKTLITVAHTDGNYLGNSWHEILKCISQLELAQLIGTGVKTRYLSGSGREREGSLKGHSLAGEEFMGLGLGNLVSGGVDKRQMASFQESVGETSSQSVVVAVDRIFTGSTRLDGNAIVDFVRWLCAVSMDELASPHHPRMFSLQKIVEISYYNMNRIRLQWSRIWHVIGDHFNKVGCNPNEDVAIFAVDSLRQLSMKFLEKGELANFRFQKDFLRPFEHIMKKNRSPTIRDMVIRCIAQMVSSQAANIRSGWKNIFAVFHQAASDHDGNIVELAFQTTGHIVSTIFQHHFPAAIDSFQDAVKCLSEFACNAAFPDTSMEAIRLIRFCGKYVSERPRVLQEYTSDDMNVAPGDRVWVRGWFPILFELSCIINRCKLDVRTRGLTVMFEIMKSYGHTFAKHWWQDLFRIVFRIFDNMKLPEQQSEKSEWMTTTCNHALYAICDVFTQFYEALHEVLLSDVFAQLQWCVKQDNEQLARSGTNCLENLVISNGEKFSPAVWDETCNCMLDIFKTTIPHVLLTWRPAGMEEEVSDRHLDVDLDRQSLSSIDRNASERGQSQLSNPTDDSWKGAPYAHQKLLASLLIKCVVQLELIQTIDNIVFYPATSKKEDAEHMVAAQQDTLDAEIHIETENQGMYKFMSSQHLFKLLDCLQESHSFSKAFNSNYEQRTVLWRAGFKGKSKPNLLKQETSSLACCLRILFRMYVDENRRDSWDEIQQRLLRVCSEALAYFITVNSESHREAWTSLLLLLLTKTLKISDEKFKAHASMYYPYLCEIMQFDLIPELRAVLRKFFLRIGLVYKIWIPEEPSQVPAALSSTW");
		HashMap<String, ICRSequenceData1> data1 = new HashMap<>();
		data1.put("data1", ICRSequenceData1.builder()
				.protein_length(proteinLength)
				.protein_sequence(proteinSequencesub)
				.build());
		proteinSequence.add(data1);

		HashMap<String, List<String>> d2PeptideIdentified = new HashMap<>();
		List<String> d2Pep0 = new ArrayList<>();
		d2Pep0.add("VVTVSGEPEQVHK");
		List<String> d2Pep1 = new ArrayList<>();
		d2Pep1.add("LAADDFR");
		d2PeptideIdentified.put("A0A1W2P872", d2Pep0);
		d2PeptideIdentified.put("A1L317", d2Pep1);

		HashMap<String, HashMap<String, List<Integer>>> d2PeptideLocated = new HashMap<>();
		HashMap<String, List<Integer>> D2PLS0 = new HashMap<>();
		List<Integer> d2PLS0Item = new ArrayList<>();
		d2PLS0Item.add(179);
		d2PLS0Item.add(191);
		D2PLS0.put("VVTVSGEPEQVHK", d2PLS0Item);
		HashMap<String, List<Integer>> D2PLS1 = new HashMap<>();
		List<Integer> d2PLS0Item1 = new ArrayList<>();
		d2PLS0Item1.add(224);
		d2PLS0Item1.add(230);
		D2PLS1.put("LAADDFR", d2PLS0Item1);
		d2PeptideLocated.put("A0A1W2P872", D2PLS0);
		d2PeptideLocated.put("A1L317", D2PLS0);
		HashMap<String, ICRSequenceData2> data2 = new HashMap<>();
		data2.put("data2", ICRSequenceData2.builder()
				.peptide_identified(d2PeptideIdentified)
				.peptide_located(d2PeptideLocated)
				.build());
		proteinSequence.add(data2);

		return ICRSequenceDTO.builder()
				.protein_sequence(proteinSequence)
				.build();
	}

	public QCRBarDTO getQCRBarDTO() {
		List<HashMap<String, List<List<Object>>>> data1 = new ArrayList<>();
		HashMap<String, List<List<Object>>> data1fmap = new HashMap<>();
		List<List<Object>> d1 = new ArrayList<>();
		List<Object> ds1 = new ArrayList<>();
		ds1.add("VVTVSGEPEQVHK");
		ds1.add(100.0);
		d1.add(ds1);
		d1.add(ds1);
		data1fmap.put("A0A1W2P872", d1);

		List<List<Object>> d2 = new ArrayList<>();
		List<Object> ds2 = new ArrayList<>();
		ds2.add("VVTVSGEPEQVHK");
		ds2.add(100.0);
		d2.add(ds2);
		d2.add(ds2);
		data1fmap.put("A1L317", d2);
		data1.add(data1fmap);
		return QCRBarDTO.builder()
				.data1(data1)
				.build();
	}

	public QCRPositionDTO getQCRPosition() {
		HashMap<String, List<QCRPositionElement>> positionMap = new HashMap<>();
		List<QCRPositionElement> E1 = new ArrayList<>();
		E1.add(QCRPositionElement.builder()
						.name("18")
						.datalabels(QCRPositionDataLabels.builder()
								.enabled(true)
								.connectorColor("false")
								.connectorWidth("false")
								.borderWidth(0)
								.useHTML(true)
								.format("<span class=\"title\">Signal Peptide=18<b class=\"tri-first\" style=\"left:18px\"></b></span>")
								.description("")
								.x(0)
								.y(45)
								.build())
						.color("#006360")
						.colorIndex(98)
						.marker(QCRPositionMarker.builder()
								.symbol("square")
								.radius(21)
								.build())
				.build());
		E1.add(QCRPositionElement.builder()
						.x(298)
						.name("DILEDVVTSAVK")
						.color("#eee")
						.colorIndex(0)
						.description("")
						.datalabels(QCRPositionDataLabels.builder()
								.enabled(false)
								.connectorColor("false")
								.connectorWidth("false")
								.y(0)
								.build())
				.build());
		positionMap.put("A2A5R2", E1);
		positionMap.put("A2AG50", E1);
		return QCRPositionDTO.builder()
				.positionMap(positionMap)
				.build();
	}
}
