package com.dergax_and_jareq.game.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Producer")
    private String producer;
    @Column(name = "Publisher")
    private String publisher;
    @Column(name = "Age_Requirements")
    private int ageRequirements;
    @Temporal(TemporalType.DATE)
    @Column(name = "Date_Release")
    private Date dateRelease;
    @Column(name = "Prize")
    private double prize;
    @Column(name = "Count")
    private int count;
    @Enumerated(EnumType.STRING)
    @Column(name = "Platform")
    private Platform platform;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_ID", referencedColumnName = "ID")
    private User user;
    @OneToMany(mappedBy = "game")
    private List<Order> orders;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getAgeRequirements() {
        return ageRequirements;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public double getPrize() {
        return prize;
    }

    public int getCount() {
        return count;
    }

    public Platform getPlatform() {
        return platform;
    }

    public User getUser() {
        return user;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAgeRequirements(int ageRequirements) {
        this.ageRequirements = ageRequirements;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
