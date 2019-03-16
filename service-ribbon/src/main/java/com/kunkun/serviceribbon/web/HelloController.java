package com.kunkun.serviceribbon.web;


import com.kunkun.serviceribbon.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "kunkun") String name) {
        return helloService.hiService(name);
    }
}



