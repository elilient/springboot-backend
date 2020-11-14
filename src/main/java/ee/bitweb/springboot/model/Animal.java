package ee.bitweb.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "data")

public class Animal {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column(name = "type")
    private String type;

    public Animal() {

    }

    public Animal(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
