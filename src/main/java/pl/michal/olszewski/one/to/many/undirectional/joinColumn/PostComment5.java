package pl.michal.olszewski.one.to.many.undirectional.joinColumn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post_comment5")
public class PostComment5 {

    @Id
    @GeneratedValue
    private Long id;

    private String review;

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

    @Override
    public String toString() {
        return "PostComment4{" +
            "id=" + id +
            ", review='" + review + '\'' +
            '}';
    }
}