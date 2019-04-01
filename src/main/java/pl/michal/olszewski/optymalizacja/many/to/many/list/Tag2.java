package pl.michal.olszewski.optymalizacja.many.to.many.list;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "Tag2")
@Table(name = "tag2")
public class Tag2 {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @ManyToMany(mappedBy = "tags")
  private List<TaggedPost2> posts = new ArrayList<>();

  public Tag2() {
  }

  public Tag2(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<TaggedPost2> getPosts() {
    return posts;
  }

  public void setPosts(List<TaggedPost2> posts) {
    this.posts = posts;
  }
}