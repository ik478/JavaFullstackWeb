package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Map;

@RestController
public class ApiController {

    @GetMapping("/api/hello")
    public String hello() {

        System.out.println("Button Pressed!");

        return "Hello from Java backend";
    }

    @PostMapping("/api/data")
    public String pressed(
        @RequestBody UserData user
    ){

        System.out.println(
          user.getName()
          + " "
          + user.getAge()
        );

        return "Hello "
               + user.getName();
    }

    @ExceptionHandler(
      IllegalArgumentException.class
    )
    public ResponseEntity<Map<String,String>>
    handleError(
      IllegalArgumentException ex
    ){

        return ResponseEntity
            .status(
               HttpStatus.BAD_REQUEST
            )
            .body(
               Map.of(
                 "error",
                 ex.getMessage()
               )
            );
    }

}