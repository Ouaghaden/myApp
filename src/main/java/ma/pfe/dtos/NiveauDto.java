package ma.pfe.dtos;

public class NiveauDto {

    private long id ;
    private String libel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibel() {
        return libel;
    }

    public void setLibel(String libel) {
        this.libel = libel;
    }

    @Override
    public String toString() {
        return "NiveauDto{" +
                "id=" + id +
                ", libel='" + libel + '\'' +
                '}';
    }
}
