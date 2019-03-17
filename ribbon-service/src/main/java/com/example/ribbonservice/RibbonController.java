package com.example.ribbonservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbon-service")
    public String helloConsumer() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/", String.class).getBody(); }
}
