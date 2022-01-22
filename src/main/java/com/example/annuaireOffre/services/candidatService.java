package com.example.annuaireOffre.services;

import com.example.annuaireOffre.beans.Candidat;
import com.example.annuaireOffre.dao.candidatDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class candidatService {
    private final candidatDao candidatDao;
    @Autowired
    public candidatService(candidatDao candidatDao) {
        this.candidatDao = candidatDao;
    }

    public List<Candidat> findAll() {
        return candidatDao.findAll();
    }

    public int save(Candidat e) {
        if (e==null)
            return -1;
        else{
            this.candidatDao.save(e);
            return 1;    }}

    public Candidat findById (Long id){
        return candidatDao.findById(id).get();
    }
    public void deleteById(Long id) {
        candidatDao.deleteById(id);
    }
    public Candidat updatecandidat(Candidat candidat){
        return candidatDao.save(candidat);
    }
}
