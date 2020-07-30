package com.dergax_and_jareq.game.service;

import com.dergax_and_jareq.game.entity.Game;
import com.dergax_and_jareq.game.respository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gameService")
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public Game createOffer(Game game){
        Game newGame = new Game();
        newGame.setName(game.getName());
        newGame.setPrize(game.getPrice());

       return gameRepository.save(newGame);
    }
}
