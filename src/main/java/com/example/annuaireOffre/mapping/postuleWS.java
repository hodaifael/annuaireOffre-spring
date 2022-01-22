package com.example.annuaireOffre.mapping;

import com.example.annuaireOffre.beans.Offre;
import com.example.annuaireOffre.beans.Postule;
import com.example.annuaireOffre.services.postuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/postule")
@CrossOrigin(origins = "http://localhost:4200")

public class postuleWS {
    @Autowired
    private postuleService service;
    @PostMapping("/")
    public int save(@RequestBody Postule e) {
        return service.save(e);
    }
    @GetMapping("/{id}")
    public Postule findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
    @GetMapping("/")
    public List<Postule> findAll() {
        return service.findAll();
    }
    @PutMapping("/")
    public ResponseEntity<Postule> updatePostule(@RequestBody Postule postule) {
        Postule uPostule = service.updatepostule(postule);
        return new ResponseEntity(uPostule, HttpStatus.OK);
    }
}
