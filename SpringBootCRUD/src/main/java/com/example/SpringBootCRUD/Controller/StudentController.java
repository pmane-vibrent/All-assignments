package com.example.SpringBootCRUD.Controller;

import com.example.SpringBootCRUD.Model.Address;
import com.example.SpringBootCRUD.Model.Student;
import com.example.SpringBootCRUD.Repository.StudentRepo;
import com.example.SpringBootCRUD.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private StudentService studentService;


    //Get used to display all the students
    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){

//        List<Student> std = studentService.getAllstudent();
//        System.out.println("Printing all student details:");
//        for (Student student : std) {
//            System.out.println("Student ID: " + student.getId());
//            System.out.println("First Name: " + student.getFirstname());
//            System.out.println("Last Name: " + student.getLastName());
//            System.out.println("Email: " + student.getEmail());
//            List<Address> addresses= student.getAddresses();
//            for (Address address : addresses) {
//                System.out.println("\tAddress ID: " + address.getId());
//                System.out.println("\tStreet: " + address.getStreet());
//                System.out.println("\tDistrict: " + address.getDistrict());
//                System.out.println("\tState: " + address.getState());
//                System.out.println("\tPincode: " + address.getPincode());
//                System.out.println("----------------------");
//            }
//
//
//            // Add more fields as needed
//            System.out.println("----------------------");
//        }

        return studentService.getAllstudent();
    }

    //Delete the given student by id
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable long id){

        studentService.DeleteStudent(id);
    }

    //Get is used to display student with given id
    @GetMapping("/getStudents/{id}")
    public List<Student> getStudents(@PathVariable long id){

//        List<Student> std = studentService.getStudents(id);
//        System.out.println("Printing all student details:");
//        for (Student student : std) {
//            System.out.println("Student ID: " + student.getId());
//            System.out.println("First Name: " + student.getFirstname());
//            System.out.println("Last Name: " + student.getLastName());
//            System.out.println("Email: " + student.getEmail());
//            List<Address> addresses= student.getAddresses();
//            for (Address address : addresses) {
//                System.out.println("\tAddress ID: " + address.getId());
//                System.out.println("\tStreet: " + address.getStreet());
//                System.out.println("\tDistrict: " + address.getDistrict());
//                System.out.println("\tState: " + address.getState());
//                System.out.println("\tPincode: " + address.getPincode());
//                System.out.println("----------------------");
//            }
//
//
//            // Add more fields as needed;
//            System.out.println("----------------------");
//        }
            return studentService.getStudents(id);
    }

    //display the student with the reference of name
    //I have used here @Pathvariable
    @GetMapping("/getStudentsbyName/{firstname}")
    public void getStudentsbyName(@PathVariable String firstname){

        studentService.getStudentsbyName(firstname);
    }
    //display the student with the reference of name
    //I have used here @RequestParam
    @GetMapping("/getStudentsbyName")
    public void getStudentsbyname(@RequestParam("firstname") String firstname){

        studentService.getStudentsbyname(firstname);
    }

    //Post to save the given record
    @PostMapping("/createStudent")
    public void createStudent(@RequestBody Student student){

        studentService.createStudent(student);
    }

    //Update the info of student
    @PutMapping("/updateStudent/{id}")
    public void  updateStudent(@PathVariable long id, @RequestBody Student student){

        studentService.updateStudent(id,student);
    }

    @GetMapping("/getStudentByAddress/{district}")
    public List<Student> getStudentByAddress(@PathVariable String district){

//        List<Student> studentsFromDistrict = studentService.getStudentsByDistrict(district);
//
//        System.out.println("Students from the particular district:");
//        for (Student student : studentsFromDistrict) {
//            System.out.println("Student ID: " + student.getId());
//            System.out.println("First Name: " + student.getFirstname());
//            System.out.println("Last Name: " + student.getLastName());
//            System.out.println("Email: " + student.getEmail());
//            System.out.println("----------------------");
//        }
        return studentService.getStudentsByDistrict(district);

    }
}
