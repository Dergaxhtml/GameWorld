package com.dergax_and_jareq.game.respository;

import com.dergax_and_jareq.game.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Long> {
    User findByLogin(String login);
}
