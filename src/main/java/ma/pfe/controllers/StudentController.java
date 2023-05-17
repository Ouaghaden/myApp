package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.dtos.StudentIdDto;
import ma.pfe.entities.StudentId;
import ma.pfe.repositories.StudentRepository;
import ma.pfe.srvices.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final static Logger LOG= LoggerFactory.getLogger(StudentController.class);
    private StudentService service;
    public StudentController(@Qualifier("service1") StudentService studentService){
        this.service=studentService;
    }
    @PostMapping
    public Long create (@RequestBody  StudentDto dto) {
        LOG.debug("start method create:{}",dto);
        long result=service.create(dto);
        LOG.debug("end method create:{}",dto);
        return result;

    }
    @PutMapping
    public boolean update (@RequestBody boolean dto){
        LOG.debug("start method update:{}",dto);
        boolean result=service.update(dto);
        LOG.debug("end method update:{}",dto);
        return result;
    }
    @DeleteMapping ("/{id}")
    public boolean delete(@PathVariable("id") long id){
        LOG.debug("start method delete dto{}",id);
        boolean result=service.delete(id);
        LOG.debug("end method delete dto{}",id);
        return result;
    }
    @GetMapping
    public  List<StudentDto> readAll(){
        LOG.debug("start method read");
       List result=service.readAll();
        LOG.debug("end method read");
        return result;


    }
    @GetMapping("/{id111}/{code111}")
    public StudentDto findById(@PathVariable("id111") long id, @PathVariable("code111") String code) {
        LOG.debug("start method findById id : {} code : {} ", id, code);
        StudentIdDto idDto = new StudentIdDto(id, code);
        return service.FindById(idDto);

    }

}
