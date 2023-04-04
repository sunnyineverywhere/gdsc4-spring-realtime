package server.gdsc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.gdsc.domain.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
