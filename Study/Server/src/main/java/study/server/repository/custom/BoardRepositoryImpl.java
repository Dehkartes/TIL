package study.server.repository.custom;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.Delete;
import org.springframework.transaction.annotation.Transactional;
import study.server.entity.Board;
import study.server.entity.QBoard;
import study.server.entity.QUser;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutionException;

@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepositoryCustom {
	private final JPAQueryFactory queryFactory;

	@Override
	@Transactional(readOnly = true)
	public List<Board> readAll() {
		QBoard qBoard = QBoard.board;
		return queryFactory.selectFrom(qBoard).fetch();

	}

	@Override
	@Transactional
	public String update(int id, String newTitle, String newContents) {
		try {
			QBoard qBoard = QBoard.board;

			queryFactory
					.update(qBoard)
					.set(qBoard.title, newTitle)
					.set(qBoard.contents, newContents)
					.where(qBoard.id.eq(id))
					.execute();
			return null;
		} catch (Exception e) {
			return e.toString();
		}

	}

	@Override
	@Transactional
	public String delete(int id) {
		try {
			QBoard qBoard = QBoard.board;

			queryFactory
					.delete(qBoard)
					.where(qBoard.id.eq(id))
					.execute();
			return "Delete Success";
		} catch (Exception e) {
			return e.toString();
		}
	}
}
