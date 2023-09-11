package study.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.server.entity.Chart;

@Repository
public interface ChartRepository extends JpaRepository<Chart, String> {
}
