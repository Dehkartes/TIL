package study.server.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.server.entity.Board;
import study.server.repository.BoardRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
	private final BoardRepository boardRepository;

	public void create(Board board) {
		boardRepository.save(board);
	}

	public List<Board> readAll() {
		return boardRepository.readAll();
	}

	public String update(int id, String newTitle, String newContents) {
		return boardRepository.update(id, newTitle, newContents);
	}

	public String delete(int id) {
		return boardRepository.delete(id);
	}
}
