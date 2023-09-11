package study.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.server.repository.ChartRepository;

@RestController
@RequestMapping("/entity")
public class EntityController {
	@Autowired
	ChartRepository chartRepository;
//	@GetMapping("/userlist")
//	public String getUserlist() {
//		List<Chart> chartList = chartRepository.findAll();
//		System.out.println(chartList.size());
//		for (Chart i : chartList) System.out.println(">>>>" + i.getUser_id());
//		return "sr";
//	}
}