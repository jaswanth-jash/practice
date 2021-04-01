package com.program.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/template/products")
    public String getProductList() {
        HttpEntity<String> entity = new HttpEntity<String>("jashu");
        return restTemplate.exchange("http://localhost:9015/std", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/template/consumer")
    public String postProductList(@RequestBody String string) {
        HttpEntity<String> entity = new HttpEntity<String>("jay");
        return restTemplate.exchange("http://localhost:9015/std1", HttpMethod.POST, entity, String.class).getBody();
    }
    @RequestMapping(value = "/template/consumer1")
    public String putProductList(@RequestBody String string) {
        HttpEntity<String> entity = new HttpEntity<String>("yojith");
        return restTemplate.exchange("http://localhost:9015/rest1", HttpMethod.PUT, entity, String.class).getBody();
    }
    @RequestMapping(value = "/template/consumer2")
    public String deleteProductList(@RequestBody String string) {
        HttpEntity<String> entity = new HttpEntity<String>("yojith");
        return restTemplate.exchange("http://localhost:9015/rest", HttpMethod.DELETE, entity, String.class).getBody();
    }
}
