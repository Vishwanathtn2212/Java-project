package org.vishwanath.java_spring_application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExampleController
 *
 * @author vishwanath
 *
 */
@RestController
@RequestMapping("api/example")
public class HelloController {

    @GetMapping("/hello-world")
    private ResponseEntity<String> get(){
        return ResponseEntity.ok("Hello World!");
    }
}
