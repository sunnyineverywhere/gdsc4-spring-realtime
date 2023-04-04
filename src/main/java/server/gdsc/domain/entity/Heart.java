package server.gdsc.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Getter
@NoArgsConstructor
public class Heart extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long heartId;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @Builder
    public Heart(Long heartId, @NonNull Account account, @NonNull Post post) {
        this.heartId = heartId;
        this.account = account;
        this.post = post;
    }
}
