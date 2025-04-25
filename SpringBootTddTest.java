package com.project;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.GetMapping;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.awt.PageAttributes.MediaType;
import java.util.Map;

@WebMvcTest(SpringtddController.class)
public class SpringBootTddTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGreetReturnsHelloBoot() throws Exception {
        mockMvc.perform(get("/greet"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello, Boot!"));
    }
    
    @Test
    public void testGreetEndpoint() throws Exception {
        mockMvc.perform(get("/greet2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello, Boot!"));
    }
    
    @Test
    public void testUpdateMessage() throws Exception {
        mockMvc.perform(put("/greet4")
                .param("newMessage", "Updated Hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Message updated to: Updated Hello"));
    }
    
    
    @Test
    public void testUpdateMessageWithJson() throws Exception {
        String json = "{\"message\":\"Hello from JSON\"}";

        mockMvc.perform(put("/greet3")
               
                .content(json))
                .andExpect(status().isOk())
                .andExpect(content().string("Updated to: Hello from JSON"));
    }
}

