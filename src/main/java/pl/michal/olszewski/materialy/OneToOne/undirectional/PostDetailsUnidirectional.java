package pl.michal.olszewski.materialy.OneToOne.undirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PostDetailsUnidirectional {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String content;

  public PostDetailsUnidirectional() {
  }

  public PostDetailsUnidirectional(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "PostDetailsBidirectional{" +
        "id=" + id +
        ", content='" + content + '\'' +
        '}';
  }
}