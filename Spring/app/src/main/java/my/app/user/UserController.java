package my.app.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@GetMapping()
	public String root() {
		return "hello world!";
	}

	@GetMapping("/test")
	public UserDTO getTest() {
		UserDTO user = new UserDTO("test", 2);
		return user;
	}
}
