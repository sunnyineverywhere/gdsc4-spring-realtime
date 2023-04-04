package server.gdsc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.gdsc.domain.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
