package pl.michal.olszewski.materialy.OneToOne.undirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PostUnidirectional {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "datails_id")
  private PostDetailsUnidirectional details;

  public PostUnidirectional(String title) {
    this.title = title;
  }

  public PostUnidirectional() {
  }

  public PostDetailsUnidirectional getDetails() {
    return details;
  }

  public void setDetails(PostDetailsUnidirectional details) {
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