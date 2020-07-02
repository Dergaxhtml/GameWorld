package com.sdacademy.gameworld.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "Nick")
    private String nick;
    @Column(name = "Password")
    private String password;
    @Column(name = "E_Mail")
    private String email;
    @Column(name = "First_Name")
    private String firstName;
    @Column(name = "Last_Name")
    private String lastName;
    @Temporal(TemporalType.DATE)
    @Column(name = "Date_Birth")
    private Date dateBirth;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Address_ID", referencedColumnName = "ID")
    private Address address;
    @OneToMany(mappedBy = "user")
    private List<Game> games;
    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    public int getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public Address getAddress() {
        return address;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
