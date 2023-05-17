
package ma.pfe.dtos;

public class StudentIdDto {

    private long id ;
    private String code;

    public StudentIdDto() {
    }

    public StudentIdDto(long id, String code) {
        this.id = id;
        this.code = code;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
