package com.example.thymeleafform.controller;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping("/api")
public class Controller {

    @RequestMapping(value = "/thymeleaf",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String getRegister(Model model) {
        try {
            return "register";
        } catch (Exception e) {
            return "erro";
        }
    }

    @RequestMapping(value = "/nextToRegister",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String getNextToRegister(Model model) {
        try {
            return "nextToRegister";
        } catch (Exception e) {
            return "erro";
        }
    }

}
