package com.project.Ecommerce.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
@RequestMapping("/user")
public class UserContoller {
    @GetMapping("/sss")
    public ResponseEntity<String> getUser (){
        System.out.println("Hello");
        return new ResponseEntity<>("fjnjg", HttpStatus.OK);
    }
}
