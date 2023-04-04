package server.gdsc.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@NoArgsConstructor
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @NonNull
    @Column(length = 45)
    private String email;

    @NonNull
    @Column(length = 45)
    private String password;

    @NonNull
    @Column(length = 45)
    private String name;

    @Builder
    public Account(Long accountId, String email, String password, String name) {
        this.accountId = accountId;
        this.email = email;
        this.password = password;
        this.name = name;
    }
}
