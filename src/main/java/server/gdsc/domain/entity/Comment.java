package server.gdsc.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Getter
@NoArgsConstructor
public class Comment extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @NonNull
    @Column()
    private String contents;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @Builder
    public Comment(Long commentId, @NonNull String contents, @NonNull Account account, @NonNull Post post) {
        this.commentId = commentId;
        this.contents = contents;
        this.account = account;
        this.post = post;
    }
}
