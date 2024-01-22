package my.app.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

	@GetMapping("/test")
	public UserDTO getTest() {
		UserDTO user = new UserDTO("test", 2);
		return user;
	}

	@GetMapping()
	public String root() {
		return "hello world!";
	}
	
	
}
