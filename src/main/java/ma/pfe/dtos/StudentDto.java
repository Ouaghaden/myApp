package ma.pfe.dtos;

import ma.pfe.entities.Adresse;

import java.util.List;

public class StudentDto {
    private StudentIdDto studentId;
    private long id;
    private String name ;

    private Adresse adresse;
    private List<CoursDto>cours;

    public List<CoursDto> getCours() {
        return cours;
    }

    public void setCours(List<CoursDto> cours) {
        this.cours = cours;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public StudentIdDto getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentIdDto studentId) {
        this.studentId = studentId;
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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "studentId=" + studentId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", adresse=" + adresse +
                ", cours=" + cours +
                '}';
    }
}
