package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import ma.pfe.srvices.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository{
    private StudentRepository repository;
    private final static Logger LOG= LoggerFactory.getLogger(StudentRepositoryImpl.class);
    @Override
    public long create(StudentEntity e) {
        LOG.debug("start methode Create");
        Long result= repository.create(e);
        LOG.debug("end methode name");
        return result;

    }

    @Override
    public boolean update(StudentEntity e) {
        LOG.debug("start methode Update");
        boolean result= repository.update(e);
        LOG.debug("end methode Update");
        return result;
    }

    @Override
    public boolean delete(long id) {
        LOG.debug("start methode Delete");
        boolean result= repository.delete(id);
        LOG.debug("end methode Delete");
        return result;
    }

    @Override
    public List<StudentEntity> readAll() {
        LOG.debug("start methode Read All");
        List result= repository.readAll();
        LOG.debug("end methode read All");
        return result;
    }

}
