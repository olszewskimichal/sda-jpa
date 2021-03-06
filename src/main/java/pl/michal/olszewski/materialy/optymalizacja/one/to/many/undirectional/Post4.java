package pl.michal.olszewski.materialy.optymalizacja.one.to.many.undirectional;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Post4")
public class Post4 {

  @Id
  @GeneratedValue
  private Long id;

  private String title;

  @OneToMany(
      cascade = CascadeType.ALL,
      orphanRemoval = true
  )
  private List<PostComment4> comments = new ArrayList<>();

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

  public List<PostComment4> getComments() {
    return comments;
  }

  public void setComments(List<PostComment4> comments) {
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