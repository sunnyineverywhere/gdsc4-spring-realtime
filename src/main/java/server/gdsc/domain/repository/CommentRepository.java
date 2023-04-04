package server.gdsc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.gdsc.domain.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
