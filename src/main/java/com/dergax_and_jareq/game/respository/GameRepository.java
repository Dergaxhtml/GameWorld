package com.dergax_and_jareq.game.respository;

import com.dergax_and_jareq.game.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Integer> {
}
