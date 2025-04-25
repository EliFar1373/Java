package com.project; // or similar, match the test class



import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringtddController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello, Boot!";
    }
    
    @GetMapping("/greet2")
    public Map<String, String> greett() {
        return Map.of("message", "Hello, Boot!");
    }
    
   
    

    
    // PUT endpoint to update the message using plain text (query param)
    private String message = "Hello, Boot!";
    @PutMapping("/greet4")
    public String updateMessage(@RequestParam String newMessage) {
        this.message = newMessage;
        return "Message updated to: " + message;
    }
    
    @PutMapping("/greet3")
    public String updateMessage(@RequestBody Map<String, String> body) {
        this.message = body.get("message");
        return "Updated to: " + message;
    }

}


