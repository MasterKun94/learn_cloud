package com.kunkun.servicefeign.web;

import com.kunkun.servicefeign.service.HiScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    private HiScheduleService hiScheduleService;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public HiController(HiScheduleService hiScheduleService) {
        this.hiScheduleService = hiScheduleService;
    }

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name", defaultValue = "kunkun") String name) {
        return hiScheduleService.sayHiFromClientOne( name );
    }
}



