package com.sdacademy.gameworld.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListGames {

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String getListGames() {
        return "";
    }

}
