package com.codnect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Burak Köken on 13.7.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }
}
