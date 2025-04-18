package com.project; // or similar, match the test class



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringtddController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello, Boot!";
    }
}


