package ma.pfe.srvices;

import ma.pfe.dtos.StudentDto;

import java.util.List;

public interface StudentService {
    long create(StudentDto dto);
    boolean update (boolean dto);
    boolean delete(long id);
    List<StudentDto> readAll();
}
