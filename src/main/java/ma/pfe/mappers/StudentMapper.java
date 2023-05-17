package ma.pfe.mappers;

import com.sun.media.sound.ModelOscillatorStream;
import ma.pfe.dtos.StudentDto;
import ma.pfe.dtos.StudentIdDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentId;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import java.text.Collator;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface StudentMapper {
    StudentEntity convertDtoToEntity (StudentDto dto);
    StudentDto convertEntityToDto (StudentEntity entity);
    List<StudentDto> convertEntityToDto (List<StudentEntity> entitys);
    StudentId convertIdDtoToEntity (StudentIdDto idDto);


}
