package pl.michal.olszewski.optymalizacja.many.to.many.set;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "Tag")
@Table(name = "tag")
public class Tag {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @ManyToMany(mappedBy = "tags")
  private Set<TaggedPost> posts = new HashSet<>();

  public Tag() {
  }

  public Tag(String name) {
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

  public Set<TaggedPost> getPosts() {
    return posts;
  }

  public void setPosts(Set<TaggedPost> posts) {
    this.posts = posts;
  }
}