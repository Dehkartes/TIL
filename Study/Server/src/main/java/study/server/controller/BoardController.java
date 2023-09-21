package study.server.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.server.entity.Board;
import study.server.entity.User;
import study.server.service.BoardService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("board")
public class BoardController {
	private final BoardService boardService;
	@PostMapping("/create")
	public void create(@RequestBody Board board) {
		System.out.println(">>>>>>>" + board.toString());
		boardService.create(board);
	}
	@GetMapping("/readall")
	public List<Board> boardReadAll() {
		return boardService.readAll();
	}

	@PostMapping("/update/{id}")
	public String updateAge(@PathVariable int id, @RequestBody Board board) {
		return boardService.update(id, board.getTitle(), board.getContents());
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return boardService.delete(id);
	}
}
