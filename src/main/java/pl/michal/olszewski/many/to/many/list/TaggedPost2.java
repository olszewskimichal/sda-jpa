package pl.michal.olszewski.many.to.many.list;

import pl.michal.olszewski.many.to.many.set.Tag;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "TaggedPost2")
@Table(name = "TaggedPost2")
public class TaggedPost2 {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    public TaggedPost2() {}

    public TaggedPost2(String title) {
        this.title = title;
    }

    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })
    @JoinTable(name = "post_tag",
        joinColumns = @JoinColumn(name = "post_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag2> tags = new ArrayList<>();

    public void addTag(Tag2 tag) {
        tags.add(tag);
        tag.getPosts().add(this);
    }

    public void removeTag(Tag2 tag) {
        tags.remove(tag);
        tag.getPosts().remove(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tag2> getTags() {
        return tags;
    }

    public void setTags(List<Tag2> tags) {
        this.tags = tags;
    }
}