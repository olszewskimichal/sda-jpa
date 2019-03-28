package pl.michal.olszewski.one.to.one.bidirectional.strong;

import javax.persistence.*;

@Entity
@Table(name = "POST_3")
public class Post3 {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToOne(mappedBy = "post")
    private PostDetails3 postDetails3;

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
                ", postDetails3=" + postDetails3 +
                '}';
    }

    public PostDetails3 getPostDetails3() {
        return postDetails3;
    }

    public void setPostDetails3(PostDetails3 postDetails3) {
        this.postDetails3 = postDetails3;
    }
}
