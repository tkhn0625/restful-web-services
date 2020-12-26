package com.tkhn0625.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/get-mapping-beans/path-variable/{pathName}")
    public HelloWorldBeans hiWorldPathVariable(@PathVariable String pathName){
        return new HelloWorldBeans(String.format("Hello World Beans!!, %s",pathName));
    }
}
