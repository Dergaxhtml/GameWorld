package com.dergax_and_jareq.game.respository;

import com.dergax_and_jareq.game.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
    User findByLogin(String login);
}
