package be.giantoaf.databaseworkwithspringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Superhero {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Double bicepsCircumference;
    private String alignment;
    private String universe;
    private String superPowerDescription;

    public Long getId() {
        return id;
    }

    public Superhero setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Superhero setName(String name) {
        this.name = name;
        return this;
    }

    public Double getBicepsCircumference() {
        return bicepsCircumference;
    }

    public Superhero setBicepsCircumference(Double bicepsCircumference) {
        this.bicepsCircumference = bicepsCircumference;
        return this;
    }

    public String getAlignment() {
        return alignment;
    }

    public Superhero setAlignment(String alignment) {
        this.alignment = alignment;
        return this;
    }

    public String getUniverse() {
        return universe;
    }

    public Superhero setUniverse(String universe) {
        this.universe = universe;
        return this;
    }

    public String getSuperPowerDescription() {
        return superPowerDescription;
    }

    public Superhero setSuperPowerDescription(String superPowerDescription) {
        this.superPowerDescription = superPowerDescription;
        return this;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bicepsCircumference=" + bicepsCircumference +
                ", alignment='" + alignment + '\'' +
                ", universe='" + universe + '\'' +
                ", superPowerDescription='" + superPowerDescription + '\'' +
                '}';
    }

}
