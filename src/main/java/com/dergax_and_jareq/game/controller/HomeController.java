package com.dergax_and_jareq.game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String homeSite(){
        return "index";
    }
}
