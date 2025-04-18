package com.project;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

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
}

