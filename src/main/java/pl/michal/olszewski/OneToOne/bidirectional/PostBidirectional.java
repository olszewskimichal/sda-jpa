package pl.michal.olszewski.OneToOne.bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PostBidirectional {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "datails_id")
  private PostDetailsBidirectional details;

  PostBidirectional(String title) {
    this.title = title;
  }

  public PostBidirectional() {
  }

  public PostDetailsBidirectional getDetails() {
    return details;
  }

  void setDetails(PostDetailsBidirectional details) {
    this.details = details;
  }

  @Override
  public String toString() {
    return "PostBidirectional{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", details=" + details +
        '}';
  }
}