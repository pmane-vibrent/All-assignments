package com.example.SpringBootCRUD;

import com.example.SpringBootCRUD.Model.Address;
import com.example.SpringBootCRUD.Model.Student;
import com.example.SpringBootCRUD.Repository.AddressRepo;
import com.example.SpringBootCRUD.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	private AddressRepo addressRepo;

	@Override
	public void run(String... args) throws Exception {
		// Creating and saving addresses for student1
//		Student student1 = new Student();
//		student1.setFirstname("Prathmesh");
//		student1.setLastName("Mane");
//		student1.setEmail("prathmesh@gmail.com");
//
//		Address address1 = new Address();
//		address1.setState("Maharashtra");
//		address1.setDistrict("Pune");
//		address1.setPincode("412202");
//		address1.setStreet("JM Road");
//		address1.setStudent(student1);
//
//		Address address2 = new Address();
//		address2.setState("Maharashtra");
//		address2.setDistrict("Satara");
//		address2.setPincode("301200");
//		address2.setStreet("Rajamata Road");
//		address2.setStudent(student1);
//
//		List<Address> student1Addresses = new ArrayList<>();
//		student1Addresses.add(address1);
//		student1Addresses.add(address2);
//
//		student1.setAddresses(student1Addresses);
//
//
//		studentRepo.save(student1);
//
//		// Creating and saving addresses for student2
//		Student student2 = new Student();
//		student2.setFirstname("Pratham");
//		student2.setLastName("More");
//		student2.setEmail("prathmmore@gmail.com");
//
//		Address address3 = new Address();
//		address3.setState("Maharashtra");
//		address3.setDistrict("Pune");
//		address3.setPincode("412202");
//		address3.setStreet("JM Road");
//		address3.setStudent(student2);
//
//		List<Address> addresses = new ArrayList<>();
//		addresses.add(address3);
//
//		student2.setAddresses(addresses);
//
//		studentRepo.save(student2);
	}
}
