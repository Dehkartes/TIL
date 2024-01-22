package my.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import my.app.user.UserDTO;

@SpringBootTest
class AppApplicationTests {

	@Test
	void contextLoads() {
		UserDTO u = new UserDTO();
		u.setAge(3);
		System.out.println(u);
	}

}
