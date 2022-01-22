package com.example.annuaireOffre.dao;

import com.example.annuaireOffre.beans.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface candidatDao extends JpaRepository<Candidat,Long> {
}
