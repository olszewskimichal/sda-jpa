package pl.michal.olszewski.one.to.many.undirectional.joinColumn;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Post6")
public class Post5 {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToMany(
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    @JoinColumn(name = "post_id")
    private List<PostComment5> comments = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<PostComment5> getComments() {
        return comments;
    }

    public void setComments(List<PostComment5> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post4{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", comments=" + comments +
            '}';
    }
}