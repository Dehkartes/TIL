package study.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.server.dto.Venn.VennDTO;
import study.server.dto.Venn.VennData;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping()
public class VennController {
	@GetMapping("/venn")
	public String getVenn() throws JsonProcessingException {
		List<VennData> dataList = new ArrayList<>();
		dataList.add(VennData.builder()
				.name("<b>345</b><br>9.54%")
				.sets(new String[]{"1_1 Intensity"})
				.value(3189)
				.build());

		dataList.add(VennData.builder()
				.name("<b>424</b><br>11.73%")
				.sets(new String[]{"1_2 Intensity"})
				.value(3268)
				.build());

		dataList.add(VennData.builder()
				.name("<b>428</b><br>11.84%")
				.sets(new String[]{"1_3 Intensity"})
				.value(3272)
				.build());

		dataList.add(VennData.builder()
				.name("<b>103</b><br>81.5%")
				.sets(new String[]{"1_1 Intensity",
						"1_3 Intensity"})
				.value(2947)
				.build());

		dataList.add(VennData.builder()
				.name("<b>161</b><br>83.1%")
				.sets(new String[]{"1_2 Intensity", "1_3 Intensity"})
				.value(3005)
				.build());

		dataList.add(VennData.builder()
				.name("<b>161</b><br>83.1%")
				.sets(new String[]{"1_2 Intensity", "1_3 Intensity"})
				.value(3005)
				.build());

		dataList.add(VennData.builder()
				.name("<b>2844</b><br>78.65%")
				.sets(new String[]{"1_1 Intensity",
						"1_2 Intensity",
						"1_3 Intensity"})
				.value(2844)
				.build());

		VennDTO vdto = VennDTO.builder()
				.type("venn")
				.title("Group 1: The number of shared proteins")
				.vennData(dataList)
				.build();

		ObjectMapper objectMapper = new ObjectMapper();
		String vennJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(vdto);
		System.out.println(vennJson);
		return vennJson;
	}
}
