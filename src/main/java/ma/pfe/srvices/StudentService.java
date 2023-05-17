package ma.pfe.srvices;

import ma.pfe.dtos.StudentDto;
import ma.pfe.dtos.StudentIdDto;

import java.util.List;

public interface StudentService {
    long create(StudentDto dto);
    boolean update (boolean dto);
    boolean delete(long id);
    List<StudentDto> readAll();
    StudentDto FindById (StudentIdDto idDto);
}
