package pl.michal.olszewski.embedded;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @GeneratedValue
    @Id
    private Long id;

    private String name;

    @Embedded
    @AttributeOverrides(value = {
        @AttributeOverride(name = "addressLine1", column = @Column(name = "house_number")),
        @AttributeOverride(name = "addressLine2", column = @Column(name = "street")),
        @AttributeOverride(name = "addressLine3", column = @Column(name = "street4"))

    })
    private Address contactAddress;

    @Embedded
    @AttributeOverrides(value = {
        @AttributeOverride(name = "addressLine1", column = @Column(name = "house_number")),
        @AttributeOverride(name = "addressLine2", column = @Column(name = "street")),
        @AttributeOverride(name = "addressLine3", column = @Column(name = "street5"))
    })
    private Address livingAddress;

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

    public Address getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(Address contactAddress) {
        this.contactAddress = contactAddress;
    }

    public Address getLivingAddress() {
        return livingAddress;
    }

    public void setLivingAddress(Address livingAddress) {
        this.livingAddress = livingAddress;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", contactAddress=" + contactAddress +
            ", livingAddress=" + livingAddress +
            '}';
    }
}
