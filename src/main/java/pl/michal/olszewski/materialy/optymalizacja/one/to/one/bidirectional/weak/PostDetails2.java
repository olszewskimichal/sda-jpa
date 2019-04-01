package pl.michal.olszewski.materialy.optymalizacja.one.to.one.bidirectional.weak;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "POST_DETAILS_2")
public class PostDetails2 {

  @Id
  @GeneratedValue
  private Long id;

  private String text;

  @OneToOne
  @JoinColumn(name = "POST_ID")
  private Post2 post;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Post2 getPost() {
    return post;
  }

  public void setPost(Post2 post) {
    this.post = post;
  }

  @Override
  public String toString() {
    return "PostDetails3{" +
        "id=" + id +
        ", text='" + text + '\'' +
        '}';
  }
}
