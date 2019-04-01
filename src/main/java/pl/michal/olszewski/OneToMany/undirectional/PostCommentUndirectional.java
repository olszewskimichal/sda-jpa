package pl.michal.olszewski.OneToMany.undirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PostCommentUndirectional {

  @Id
  @GeneratedValue
  private Long id;

  private String review;

  public PostCommentUndirectional() {
  }

  public PostCommentUndirectional(String review) {
    this.review = review;
  }
}