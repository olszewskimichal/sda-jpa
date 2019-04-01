package pl.michal.olszewski.ManyToMany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ManyToManyTag {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @ManyToMany(mappedBy = "tags")
  private List<ManyToManyPost> posts = new ArrayList<>();

  public ManyToManyTag() {
  }

  public ManyToManyTag(String name) {
    this.name = name;
  }

  public List<ManyToManyPost> getPosts() {
    return posts;
  }
}
