package com.example.annuaireOffre.mapping;

import com.example.annuaireOffre.beans.Candidat;

import com.example.annuaireOffre.services.candidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/candidat")
@CrossOrigin(origins = "http://localhost:4200")

public class candidatWS {
    @Autowired
    private candidatService service;
    @PostMapping("/")
    public int save(@RequestBody Candidat e) {
        return service.save(e);
    }
    @GetMapping("/{id}")
    public Candidat findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
    @GetMapping("/")
    public List<Candidat> findAll() {
        return service.findAll();
    }
    @PutMapping("/")
    public ResponseEntity<Candidat> updateCandidat(@RequestBody Candidat candidat) {
        Candidat uCandidat = service.updatecandidat(candidat);
        return new ResponseEntity(uCandidat, HttpStatus.OK);
    }
}
