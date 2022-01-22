package com.example.annuaireOffre.beans;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private  String password;
    private String email;

    @OneToMany(targetEntity = Offre.class,mappedBy = "candidat",fetch = FetchType.EAGER)
    @JsonManagedReference(value = "candidat-offre")
    private List<Offre> offre;


    @OneToMany(targetEntity = Postule.class,mappedBy = "candidat",fetch = FetchType.EAGER)
    private Set<Postule> postulesA;


    public Set<Postule> getPostulesA() {
        return postulesA;
    }

    public void setPostulesA(Set<Postule> postulesA) {
        this.postulesA = postulesA;
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

    public List<Offre> getOffre() {
        return offre;
    }

    public void setOffre(List<Offre> offre) {
        this.offre = offre;
    }
}
