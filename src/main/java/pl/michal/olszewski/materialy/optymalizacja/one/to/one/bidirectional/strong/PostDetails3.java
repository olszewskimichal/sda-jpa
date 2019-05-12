package pl.michal.olszewski.materialy.optymalizacja.one.to.one.bidirectional.strong;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "POST_DETAILS_3")
public class PostDetails3 {

  @Id
  @GeneratedValue //Niepotrzebne
  private Long id;

  private String text;

  @OneToOne
  @MapsId
  private Post3 post;

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

  public Post3 getPost() {
    return post;
  }

  public void setPost(Post3 post) {
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
