package ma.pfe.srvices;

import ma.pfe.dtos.StudentDto;
import ma.pfe.repositories.StudentRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
private StudentService service;
    private final static Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);
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
}
