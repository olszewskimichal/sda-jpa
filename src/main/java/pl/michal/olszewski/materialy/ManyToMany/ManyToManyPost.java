package pl.michal.olszewski.materialy.ManyToMany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class ManyToManyPost {

  @Id
  @GeneratedValue
  private Long id;

  private String title;

  public ManyToManyPost() {
  }

  public ManyToManyPost(String title) {
    this.title = title;
  }

  @ManyToMany(cascade = {
      CascadeType.PERSIST,
      CascadeType.MERGE
  })
  @JoinTable(name = "m2m_post_tag",
      joinColumns = @JoinColumn(name = "post_id"),
      inverseJoinColumns = @JoinColumn(name = "tag_id")
  )
  private List<ManyToManyTag> tags = new ArrayList<>();

  //Getters and setters ommitted for brevity

  public void addTag(ManyToManyTag tag) {
    tags.add(tag);
    tag.getPosts().add(this);
  }

  public void removeTag(ManyToManyTag tag) {
    tags.remove(tag);
    tag.getPosts().remove(this);
  }
}
