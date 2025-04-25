package com.project;





import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



class User {
    public String name;
    public int age;
}

@RestController
public class RESTAPIHelloController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // POST endpoint that accepts JSON data
    @PostMapping("/greet")
    public String greetUser(@RequestBody User user) {
        return "Hello, " + user.name + "! You are " + user.age + " years old.";
    }
}


