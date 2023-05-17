package ma.pfe.srvices;

import ma.pfe.dtos.StudentDto;
import ma.pfe.dtos.StudentIdDto;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("service1")
public class StudentServiceImpl implements StudentService{
private StudentService service;
private StudentRepository studentRepository;
private StudentMapper studentMapper= Mappers.getMapper(StudentMapper.class);
    private final static Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);
    public StudentServiceImpl(@Qualifier("repo1") StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    @Override
    public long create(StudentDto dto) {
        LOG.debug("start methode Create");
        Long result= service.create(dto);
        LOG.debug("end methode Create");
        return result;
    }

    @Override
    public boolean update(boolean dto) {
        LOG.debug("start methode Update");
        boolean result= service.update(dto);
        LOG.debug("end methode Update");
        return result;
    }

    @Override
    public boolean delete(long id) {
        LOG.debug("start methode Delete");
        boolean result= service.delete(id);
        LOG.debug("end methode Delete");
        return result;
    }

    @Override
    public List<StudentDto> readAll() {
        LOG.debug("start methode Read All");
        List result= service.readAll();
        LOG.debug("end methode read All");
        return result;
    }

    @Override
    public StudentDto FindById(StudentIdDto idDto) {
        LOG.debug("start method findById idDto : {} ", idDto);
        return studentMapper.convertEntityToDto(
                studentRepository
                        .findById(studentMapper.convertIdDtoToEntity(idDto))
                        .orElse(null));
    }
}
