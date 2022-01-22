package com.example.annuaireOffre.mapping;

import com.example.annuaireOffre.beans.Admin;
import com.example.annuaireOffre.services.adminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class adminWS {
    @Autowired
    private adminService service;

    @PostMapping("/login")
    public ResponseEntity<Admin> login (@RequestBody Admin admin) {
        Admin ad = service.findByLoginAndPassword(admin);
        return new ResponseEntity<>(ad, HttpStatus.OK);
    }
    @PostMapping("/")
    public int save(@RequestBody Admin e) {
        return service.save(e);
    }
    @GetMapping("/{id}")
    public Admin findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
    @GetMapping("/")
    public List<Admin> findAll() {
        return service.findAll();
    }
}
