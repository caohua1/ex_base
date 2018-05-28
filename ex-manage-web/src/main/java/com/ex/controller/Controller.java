package com.ex.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/video")
public class Controller {

    @RequestMapping("/ceshi")
    public String ceshi(){

        return "qq";
    }
}
