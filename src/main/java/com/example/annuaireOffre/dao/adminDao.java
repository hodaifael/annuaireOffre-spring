package com.example.annuaireOffre.dao;

import com.example.annuaireOffre.beans.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface adminDao  extends JpaRepository<Admin,Long> {
    Admin findByLoginAndPassword(String login, String password);
}
