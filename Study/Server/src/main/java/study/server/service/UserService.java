package study.server.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import study.server.entity.User;
import study.server.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;

	public String create( User user) {
		try {
			userRepository.save(user);
			return "Create Success!";
		} catch (Exception e) {
			System.out.println(e);
			return "Create Fail!";
		}
	}

	public ResponseEntity<User> readById(int id) {
		Optional<User> userOptional = userRepository.findById(id);
		if (userOptional.isPresent()) {
			User user = userOptional.get();
			return ResponseEntity.ok(user);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	public List<User> readAll() {
		return userRepository.findAll();
	}

	public ResponseEntity<User> updateAge(int id, int newAge) {
		Optional<User> userOptional = userRepository.findById(id);

		if (userOptional.isPresent()) {
			User user = userOptional.get();
			user.setAge(newAge);
			User updatedUser = userRepository.save(user);
			return ResponseEntity.ok(updatedUser);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	public ResponseEntity<Void> deleteById(int userId) {
		Optional<User> userOptional = userRepository.findById(userId);

		if (userOptional.isPresent()) {
			User user = userOptional.get();
			userRepository.delete(user);
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
