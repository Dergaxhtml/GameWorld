package com.dergax_and_jareq.game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GamesController {

    @RequestMapping("/home")
    public String homeSite(){
        return "index";
    }

//    @RequestMapping(value = "/listgames")
//    public String listgames() {
//        return "listgames";
//    }

}