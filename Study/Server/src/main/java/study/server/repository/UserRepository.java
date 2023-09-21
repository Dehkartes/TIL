package study.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.server.entity.User;


//public interface UserRepository extends JpaRepository<User, Integer>, 커스텀 레포<> {}
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {}
