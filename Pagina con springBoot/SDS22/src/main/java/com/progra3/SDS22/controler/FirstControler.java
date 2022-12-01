package com.progra3.SDS22.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstControler {
    @RequestMapping(value = "information")
    public String Info(){
        return "information";
    }
    ;

}
