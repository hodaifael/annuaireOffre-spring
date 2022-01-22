package com.example.annuaireOffre.services;

import com.example.annuaireOffre.beans.Postule;
import com.example.annuaireOffre.dao.postuleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional

public class postuleService {
    private final postuleDao postuleDao;
    @Autowired
    public postuleService(postuleDao postuleDao) {
        this.postuleDao = postuleDao;
    }

    public List<Postule> findAll() {
        return postuleDao.findAll();
    }

    public int save(Postule e) {
        if (e==null)
            return -1;
        else{
            this.postuleDao.save(e);
            return 1;    }}

    public Postule findById (Long id){
        return postuleDao.findById(id).get();
    }
    public void deleteById(Long id) {
        postuleDao.deleteById(id);
    }
    public Postule updatepostule(Postule postule){
        return postuleDao.save(postule);
    }
}
