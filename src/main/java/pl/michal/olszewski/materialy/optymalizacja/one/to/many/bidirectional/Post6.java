package pl.michal.olszewski.materialy.optymalizacja.one.to.many.bidirectional;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Post6")
public class Post6 {

  @Id
  @GeneratedValue
  private Long id;

  private String title;

  @OneToMany(
      mappedBy = "post",
      cascade = CascadeType.ALL,
      orphanRemoval = true
  )
  private List<PostComment6> comments = new ArrayList<>();

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

  public List<PostComment6> getComments() {
    return comments;
  }

  public void setComments(List<PostComment6> comments) {
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