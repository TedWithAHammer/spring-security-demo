package com.poseidon.security_demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by leo on 2019/6/6.
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebSecurityTest {
    TestRestTemplate restTemplate;
    URL base;
    @LocalServerPort
    private int port;

    @Before
    public void setUp() throws MalformedURLException {
        restTemplate = new TestRestTemplate("USER", "123");
    }



}
