package com.example.RestDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class loginController {

    @Autowired
    private List<login> loginList = new ArrayList<>();


    @PostMapping("/post")
    public String Recordsave(@RequestBody login l){
       // login user = new login(l.getUsername(), l.getEmail(), l.getPassword());
        return "Saved record";
    }



    @GetMapping("/post/{username}")
    public String Checkuser(@PathVariable String username,@RequestParam(required = false) String email, @RequestParam(required = false) String password){
        login user = new login("Prathmesh","pm@gamil.com","pm@pass");
        login user1 = new login("Prathm","pratham@gamil.com","pratham@pass");
        login user2 = new login("Om","om@gamil.com","om@pass");

        if (username.equals("111")) {
        return "Error Internal server ";
        }

        for (login users : loginList) {
            if (users.getUsername().equals(username)) {
                System.out.println(users.getUsername());
                return "User found";
            }
        }
        return "User not found";
    }

    @DeleteMapping("/delete/{username}")
    public String Deleteuser(@PathVariable String username){

        if (username.equals("111")) {
            return "Error Internal server ";
        }

        for (login user : loginList) {
            if (user.getUsername().equals(username)) {

                return "User Deleted";
            }
        }
        return "User not found";
    }
}
