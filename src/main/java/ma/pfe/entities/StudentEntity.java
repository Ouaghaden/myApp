package ma.pfe.entities;

import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "studentEntity")
public class StudentEntity {
    @EmbeddedId
    @Id
    private long id;
    @Column(name = "name")
    private String  name;
    @ManyToMany(cascade = {CascadeType.MERGE,
            CascadeType.PERSIST,},fetch = FetchType.EAGER)

    @JoinTable(name= "Cours")
    private List<Cours>cours;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="rue",column = @Column(name = "rue_student")),
            @AttributeOverride(name="avenue",column = @Column(name = "avenue_student"))})
            private Adresse adresse;
    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public StudentEntity() {super();
    }

    public StudentEntity(long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public List<Cours> getCours() {
        return cours;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
