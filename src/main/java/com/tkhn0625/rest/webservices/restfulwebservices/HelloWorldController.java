package com.tkhn0625.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/get-mapping")
    public String hiWorld(){
        return "Get Mapping is very simple !!";
    }


    @GetMapping(path = "/get-mapping-beans")
    public HelloWorldBeans hiWorldBeans(){
        return new HelloWorldBeans("Hello World Beans!!");
    }
}
