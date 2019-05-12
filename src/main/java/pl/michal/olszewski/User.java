/*
package pl.michal.olszewski;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    @Embedded
    private Address contactaddress;
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "street",
                    column = @Column(name = "deliveryStreet")),
            @AttributeOverride(name = "city",
                    column = @Column(name = "deliveryCity")),
            @AttributeOverride(name = "postCode",
                    column = @Column(name = "deliveryPostCode")),
    })
    private Address deliveryaddress;

    public User() {
    }

    public User(String firstname, String lastname, Address contactaddress) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactaddress = contactaddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(Address contactaddress) {
        this.contactaddress = contactaddress;
    }

    public Address getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(Address deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }
}
*/
