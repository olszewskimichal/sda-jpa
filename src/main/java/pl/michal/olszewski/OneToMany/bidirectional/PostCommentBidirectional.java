package pl.michal.olszewski.OneToMany.bidirectional;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PostCommentBidirectional {

  @Id
  @GeneratedValue
  private Long id;

  private String review;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "post_id")
  private Post2Bidirectional post;

  public PostCommentBidirectional() {
  }

  public PostCommentBidirectional(String review) {
    this.review = review;
  }
}