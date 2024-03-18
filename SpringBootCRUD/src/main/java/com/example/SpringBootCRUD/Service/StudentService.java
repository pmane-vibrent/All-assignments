package com.example.SpringBootCRUD.Service;

import com.example.SpringBootCRUD.Exception.ResourceNotFoundException;
import com.example.SpringBootCRUD.Model.Address;
import com.example.SpringBootCRUD.Model.Student;
import com.example.SpringBootCRUD.Repository.AddressRepo;
import com.example.SpringBootCRUD.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private AddressRepo addressRepo;
    private long id;

    @Transactional
    public List<Student> getAllstudent(){

        return studentRepo.displaystudent();
    }
    @Transactional
    public void DeleteStudent(Long id){

        studentRepo.deleteById(id);
    }

    @Transactional
    public List<Student> getStudents(@PathVariable long id){
        this.id = id;

        return studentRepo.findAllById(Collections.singleton(id));
    }

    @Transactional
    public List<Student> getStudentsbyName(@PathVariable String firstname){

        return studentRepo.findByFirstname(firstname);
    }

    @Transactional
    public List<Student> getStudentsbyname(@RequestParam("firstname") String firstname){

        return studentRepo.findByFirstname(firstname);
    }

    @Transactional
    public Student createStudent(Student student) {
        List<Address> addresses = student.getAddresses();
        if (addresses != null) {
            for (Address address : addresses) {
                address.setStudent(student);
            }
        }
        return studentRepo.save(student);
    }


    @Transactional
    public Student updateStudent(@PathVariable long id, @RequestBody Student student){

        Student updatedStudent=new Student();
        updatedStudent= studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + id));;
        updatedStudent.setFirstname(student.getFirstname());
        updatedStudent.setLastName(student.getLastName());
        updatedStudent.setEmail(student.getEmail());
        List<Address> addresses = student.getAddresses();
        if (addresses != null) {

            for (Address address : addresses) {

                address.setStudent(updatedStudent);

                updatedStudent.setAddresses(addresses);
            }
        }

        return studentRepo.save(updatedStudent);
    }

    @Transactional
    public List<Student> getStudentsByDistrict(String district) {
        return studentRepo.findByAddressesDistrict(district);
    }


}
