package ma.pfe.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Inheritance
@PrimaryKeyJoinColumn(name = "id_book")
public class Responsable extends StudentEntity {
    private String reference ;
    public String getReference() {
        return reference;
    }
    public Responsable (String reference) {
        this.reference = reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
}
