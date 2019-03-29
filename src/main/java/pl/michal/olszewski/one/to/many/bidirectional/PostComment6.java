package pl.michal.olszewski.one.to.many.bidirectional;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "post_comment6")
public class PostComment6 {

    @Id
    @GeneratedValue
    private Long id;

    private String review;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post6 post;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Post6 getPost() {
        return post;
    }

    public void setPost(Post6 post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "PostComment6{" +
            "id=" + id +
            ", review='" + review + '\'' +
            '}';
    }
}