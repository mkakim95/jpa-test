package kz.mkakim.jpatest.domain;

import javax.persistence.*;

@Entity
@Table(name = "post_comment")
public class PostComment {

    @Id
    @GeneratedValue
    private Long id;

    private String review;

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;
}
