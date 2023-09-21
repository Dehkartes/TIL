package study.server.repository.custom;

import org.springframework.stereotype.Repository;
import study.server.entity.Board;

import java.util.List;

@Repository
public interface BoardRepositoryCustom {

	List<Board> readAll();

	String update(int id, String newTitle, String newContents);

	String delete(int id);
}