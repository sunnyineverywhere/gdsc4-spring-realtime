package server.gdsc.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@NoArgsConstructor
@Entity
public class Post extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @NonNull
    @Column(length = 64)
    private String title;

    @NonNull
    @Column()
    private String contents;

    @Enumerated
    private PostStatus status;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @Builder
    public Post(Long postId, String title, String contents, PostStatus status, Account account) {
        this.postId = postId;
        this.title = title;
        this.contents = contents;
        this.status = status;
        this.account = account;
    }
}
