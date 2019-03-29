package pl.michal.olszewski.one.to.one.bidirectional.weak;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "POST_2")
public class Post2 {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToOne(mappedBy = "post")
    private PostDetails2 postDetails2;

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

    @Override
    public String toString() {
        return "Post3{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", postDetails2=" + postDetails2 +
            '}';
    }

    public PostDetails2 getPostDetails2() {
        return postDetails2;
    }

    public void setPostDetails2(PostDetails2 postDetails2) {
        this.postDetails2 = postDetails2;
    }
}
