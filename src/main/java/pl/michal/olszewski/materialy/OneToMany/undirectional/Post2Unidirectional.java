package pl.michal.olszewski.materialy.OneToMany.undirectional;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Post2Unidirectional {

  @Id
  @GeneratedValue
  private Long id;

  private String title;

  @OneToMany(
      cascade = CascadeType.ALL,
      orphanRemoval = true
  )
  @JoinColumn(name = "post_id")
  private List<PostCommentUndirectional> comments = new ArrayList<>();

  public Post2Unidirectional(String title) {
    this.title = title;
  }

  public Post2Unidirectional() {
  }

  public List<PostCommentUndirectional> getComments() {
    return comments;
  }

  //Constructors, getters and setters removed for brevity
}