package study.server.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.server.entity.User;
import study.server.repository.UserRepository;
import study.server.service.UserService;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserController {
	private final UserService userService;
	@PostMapping("create")
	public String userCreate(@RequestBody User user) {
		return userService.create(user);
	}

	@GetMapping("read/{id}")
	public ResponseEntity<User> readUserById(@PathVariable int id) {
		return userService.readById(id);
	}
	@GetMapping("readall")
	public List<User> getAllUsers() {
		return userService.readAll();
	}

	@PostMapping("update/{id}")
	public ResponseEntity<User> updateAge(@PathVariable int id, @RequestBody() User user) {
		return userService.updateAge(id, user.getAge());
	}

	@DeleteMapping("delete/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable int userId) {
		return userService.deleteById(userId);
	}
}
