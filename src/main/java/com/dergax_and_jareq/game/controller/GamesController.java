package com.dergax_and_jareq.game.controller;

import com.dergax_and_jareq.game.entity.Game;
import com.dergax_and_jareq.game.respository.GameRepository;
import com.dergax_and_jareq.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class GamesController {

    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/listgames")
    public String listgames() {
        return "listgames";
    }

    @RequestMapping(value = "/createOffer")
    public String createOffer(Model model) {
        model.addAttribute("game", new Game());
        return "createOffer";
    }

    @RequestMapping(value = "/createOffer", method = RequestMethod.POST)
    public String createOffer(@ModelAttribute("createOffer") @Validated Game game, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return "createOffer";
        } else {
            gameService.createOffer(game);

            return "redirect:/listgames";
        }
    }
}