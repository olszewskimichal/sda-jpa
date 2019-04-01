package pl.michal.olszewski.OneToOne.bidirectional;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PostDetailsBidirectional {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String content;
  @OneToOne(mappedBy = "details", fetch = FetchType.LAZY)
  private PostBidirectional postBidirectional;

  public PostDetailsBidirectional() {
  }

  public PostDetailsBidirectional(String content) {
    this.content = content;
  }

  public PostBidirectional getPostBidirectional() {
    return postBidirectional;
  }

  public void setPostBidirectional(PostBidirectional postBidirectional) {
    this.postBidirectional = postBidirectional;
  }

  @Override
  public String toString() {
    return "PostDetailsBidirectional{" +
        "id=" + id +
        ", content='" + content + '\'' +
        '}';
  }
}