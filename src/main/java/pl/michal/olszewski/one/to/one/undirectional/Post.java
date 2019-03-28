package pl.michal.olszewski.one.to.one.undirectional;

import javax.persistence.*;

@Entity
@Table(name = "POST_1")
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToOne
    @JoinColumn(name = "DETAILS_ID") //TODO wyjasnic roznice bez
    private PostDetails postDetails;

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
                ", postDetails=" + postDetails +
                '}';
    }

    public PostDetails getPostDetails() {
        return postDetails;
    }

    public void setPostDetails(PostDetails postDetails) {
        this.postDetails = postDetails;
    }
}
