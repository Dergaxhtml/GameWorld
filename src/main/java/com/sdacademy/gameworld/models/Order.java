package com.sdacademy.gameworld.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @ManyToOne
    @JoinColumn(name = "Game_ID", referencedColumnName = "ID")
    private Game game;
    @Column(name = "Count")
    private int count;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Date_Order", columnDefinition = "DATETIME")
    private Date dateOrder;
    @Enumerated(EnumType.STRING)
    @Column(name = "Status_Order")
    private StatusOrder statusOrder;
    @ManyToOne
    @JoinColumn(name = "User_ID", referencedColumnName = "ID")
    private User user;
    @ManyToOne
    @JoinColumn(name = "Address_ID", referencedColumnName = "ID")
    private Address address;


    public int getId() {
        return id;
    }

    public Game getGame() {
        return game;
    }

    public int getCount() {
        return count;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public Address getAddress() {
        return address;
    }

    public User getUser() {
        return user;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }

    public void setUser(User buyerUser) {
        this.user = buyerUser;
    }
}
