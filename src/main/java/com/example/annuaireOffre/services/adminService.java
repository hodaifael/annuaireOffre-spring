package com.example.annuaireOffre.services;

import com.example.annuaireOffre.beans.Admin;
import com.example.annuaireOffre.dao.adminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class adminService {
    private final adminDao adminDao;

    @Autowired
    public adminService(adminDao adminDao) {
        this.adminDao = adminDao;
    }

    public List<Admin> findAll() {
        return adminDao.findAll();
    }
    public Admin findByLoginAndPassword(Admin admin){
        return adminDao.findByLoginAndPassword(admin.getLogin(),admin.getPassword());
    }
    public int save(Admin e) {
        if (e==null)
            return -1;
        else{
            this.adminDao.save(e);
            return 1;    }}

    public Admin findById (Long id){
        return adminDao.findById(id).get();
    }
    public void deleteById(Long id) {
        adminDao.deleteById(id);
    }
}
