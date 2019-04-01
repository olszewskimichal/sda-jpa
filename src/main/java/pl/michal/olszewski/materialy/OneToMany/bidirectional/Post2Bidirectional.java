package pl.michal.olszewski.materialy.OneToMany.bidirectional;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Post2Bidirectional {

  @Id
  @GeneratedValue
  private Long id;

  private String title;

  @OneToMany(
      mappedBy = "post",
      cascade = CascadeType.ALL,
      orphanRemoval = true
  )
  private List<PostCommentBidirectional> comments = new ArrayList<>();

  public Post2Bidirectional(String title) {
    this.title = title;
  }

  public Post2Bidirectional() {
  }

  public List<PostCommentBidirectional> getComments() {
    return comments;
  }

  //Constructors, getters and setters removed for brevity
}