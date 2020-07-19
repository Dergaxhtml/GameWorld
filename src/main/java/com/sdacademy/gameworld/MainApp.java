package com.sdacademy.gameworld;

import com.sdacademy.gameworld.models.*;
import com.sdacademy.gameworld.utils.HashPassword;
import com.sdacademy.gameworld.utils.HibernateManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.omg.SendingContext.RunTime;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainApp {

    ///Game
    /* Game game = new Game();

        game.setName("Watch Dogs 2");
        game.setProducer("Ubisoft Montreal");
        game.setPublisher("Ubisoft");
        game.setAgeRequirements(18);
        game.setDateRelease(new Date(117, Calendar.NOVEMBER, 29));
        game.setPrize(199.99);
        game.setCount(3);
        game.setPlatform(Platform.PC);
        game.setUser(user1);*/

    //User
    /*Country country = session.find(Country.class, 1);

    User user = new User();

    Address address = new Address();
        address.setCountry(country);
        address.setCity("Warszawa");
        address.setStreet("Warszawska 10");
        address.setPostalCode("00-044");

        user.setNick("ZStonoga");
        user.setPassword(HashPassword.hash("123456789"));
        user.setEmail("zbigniewstonoga@gmail.com");
        user.setFirstName("Zbigniew");
        user.setLastName("Stonoga");
        user.setDateBirth(new Date(74, Calendar.OCTOBER, 17));
        user.setAddress(address);*/

    /*Order order = new Order();
        order.setGame(game1);
        order.setCount(count);
        order.setDateOrder(new Date());
        order.setStatusOrder(StatusOrder.IN_PROGRESS);
        order.setUser(user4);
        order.setAddress(user4.getAddress());*/

}