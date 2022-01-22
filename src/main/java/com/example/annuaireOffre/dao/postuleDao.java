package com.example.annuaireOffre.dao;

import com.example.annuaireOffre.beans.Postule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface postuleDao extends JpaRepository<Postule,Long> {
}
