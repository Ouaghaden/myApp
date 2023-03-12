package ma.pfe.mappers;

import com.sun.media.sound.ModelOscillatorStream;
import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.text.Collator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    StudentEntity convertDtoToEntity (StudentDto dto){
        StudentEntity entity=new StudentEntity();
        entity.setName(dto.getName());
        return entity;
    }
    StudentDto convertEntityToDto (StudentEntity entity){
        StudentDto dto=new StudentDto();
        dto.setName(entity.getName());
        return dto;
    }
    List<StudentEntity> convertDtoToEntity (List<StudentDto> dtos){
        return dtos.stream()
                .map(dto -> convertDtoToEntity(dto))
                .collect(Collectors.toList());
    }

    List<StudentDto> convertEntityToDto (List<StudentEntity> entitys){
        return entitys.stream()
                .map(entity -> convertEntityToDto(entity))
                .collect(Collectors.toList());
    }

}
