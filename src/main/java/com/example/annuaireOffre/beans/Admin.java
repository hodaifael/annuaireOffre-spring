package com.example.annuaireOffre.beans;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private  String password;
    private String email;

    @OneToMany(targetEntity = Offre.class,mappedBy = "admin",fetch = FetchType.EAGER)
    @JsonManagedReference(value = "admin-offre")
    private List<Offre> offread;


    public List<Offre> getOffread() {
        return offread;
    }

    public void setOffread(List<Offre> offread) {
        this.offread = offread;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
