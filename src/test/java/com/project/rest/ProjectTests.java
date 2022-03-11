package com.project.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment =SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProjectTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultWelcomeMessage() throws Exception{
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", String.class ))
                .contains("Welcome to your Voting Station");
    }

    @Test
    public void greetingShouldReturnPersonMessage() throws Exception{
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", String.class ))
                .contains("[{\"id\":2,\"fistName\":\"James\",\"lastName\":\"McAvoy\",\"age\":33,\"occupation\":\"developer\"}]");
    }







}
