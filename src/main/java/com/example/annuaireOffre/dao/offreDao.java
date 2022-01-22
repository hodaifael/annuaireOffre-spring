package com.example.annuaireOffre.dao;

import com.example.annuaireOffre.beans.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface offreDao extends JpaRepository<Offre,Long> {

}
