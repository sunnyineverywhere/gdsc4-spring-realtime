package server.gdsc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.gdsc.domain.entity.Heart;

public interface HeartRepository extends JpaRepository<Heart, Long> {
}
