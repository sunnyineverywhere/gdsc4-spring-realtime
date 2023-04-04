package server.gdsc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.gdsc.domain.entity.Account;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByEmail(String email);
}
