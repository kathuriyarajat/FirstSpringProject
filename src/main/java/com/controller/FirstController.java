package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String load(){
        return "FirstFile";
    }

}
