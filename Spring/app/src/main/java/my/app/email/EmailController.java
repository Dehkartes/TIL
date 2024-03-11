package my.app.email;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {

	private final EmailService mailService;

	@PostMapping("/check")
	public String mailCheck(String email) {
		int number = mailService.sendMail(email);

		String num = "" + number;

		return num;
	}
}
