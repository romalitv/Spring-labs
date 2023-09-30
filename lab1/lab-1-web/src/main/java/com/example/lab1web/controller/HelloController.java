package com.example.lab1web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    String helloWorld() {
        return "Type our names in URL! " + "<br>" +
                "/roma , /ivan , /mykhailo";
    }

    @GetMapping("/roma")
    @ResponseBody
    String romaInfo() {
        return "Roma Lytvyniuk" + "<br>" +
                "Birthday: 06.03.2004" + "<br>" +
                "Group: IM-13";
    }

    @GetMapping("/ivan")
    @ResponseBody
    String ivanInfo() {
        return "Ivan Lotokhin" + "<br>" +
                "Birthday: 15.01.2004" + "<br>" +
                "Group: IM-13";
    }

    @GetMapping("/mykhailo")
    @ResponseBody
    String mykhailoInfo() {
        return "Moliakov Mykhailo" + "<br>" +
                "Birthday: 28.12.2003" + "<br>" +
                "Group: IM-13";
    }
}
