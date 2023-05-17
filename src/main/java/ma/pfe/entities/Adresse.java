package ma.pfe.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
    private String rue;
    private String avenue;

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }
}
