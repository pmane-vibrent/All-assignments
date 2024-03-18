package com.example.SpringBootCRUD.Repository;

import com.example.SpringBootCRUD.Model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {




    List<Student> findByFirstname(String firstname);
//    @Query("SELECT DISTINCT s " +
//            "FROM Student s " +
//            "JOIN FETCH s.addresses")
//    List<Student> findAllWithAddresses();


    @Query("FROM Student ")
    List<Student> displaystudent();
    List<Student> findByAddressesDistrict(String district);
}
