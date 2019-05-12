package pl.michal.olszewski.materialy;

import javax.persistence.*;

@Entity
public class Pesel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;

    @OneToOne(mappedBy = "pesel",fetch = FetchType.LAZY)
    private Human human;

    public Pesel() {
    }

    public Pesel(String value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
