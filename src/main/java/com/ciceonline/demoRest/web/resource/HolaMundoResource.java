package com.ciceonline.demoRest.web.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoResource {

    @RequestMapping(path = "/Saludar", method = RequestMethod.GET)
    public String saludar (){
        return "Hola Mundo, este es el primer endpoint con SpringBoot";
    }
}
