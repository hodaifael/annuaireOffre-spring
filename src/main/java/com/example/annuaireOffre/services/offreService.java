package com.example.annuaireOffre.services;

import com.example.annuaireOffre.beans.Offre;
import com.example.annuaireOffre.dao.offreDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class offreService {

    private final offreDao offreDao;
    @Autowired
    public offreService(offreDao offreDao) {
        this.offreDao = offreDao;
    }

    public List<Offre> findAll() {
        return offreDao.findAll();
    }

    public int save(Offre e) {
        if (e==null)
            return -1;
        else{
            this.offreDao.save(e);
            return 1;    }}

    public Offre findById (Long id){
        return offreDao.findById(id).get();
    }
    public void deleteById(Long id) {
        offreDao.deleteById(id);
    }
    public Offre updateoffre(Offre offre){
        return offreDao.save(offre);
    }
}
