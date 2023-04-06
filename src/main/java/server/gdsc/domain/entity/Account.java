package server.gdsc.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column(length = 45)
    private String email;

    @Column(length = 45)
    private String name;

    @Column(length = 45)
    private String password;

    @Builder
    public Account(Long accountId, String email, String name, String password) {
        this.accountId = accountId;
        this.email = email;
        this.name = name;
        this.password = password;
    }
}
