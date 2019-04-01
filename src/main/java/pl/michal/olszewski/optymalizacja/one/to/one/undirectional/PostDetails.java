package pl.michal.olszewski.optymalizacja.one.to.one.undirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POST_DETAILS_1")
public class PostDetails {

  @Id
  @GeneratedValue
  private Long id;

  private String text;

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

  @Override
  public String toString() {
    return "PostDetails3{" +
        "id=" + id +
        ", text='" + text + '\'' +
        '}';
  }
}
