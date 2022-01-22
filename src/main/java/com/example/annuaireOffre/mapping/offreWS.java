package com.example.annuaireOffre.mapping;

import com.example.annuaireOffre.beans.Offre;
import com.example.annuaireOffre.services.offreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/offre")
@CrossOrigin(origins = "http://localhost:4200")

public class offreWS {
    @Autowired
    private offreService service;
    @PostMapping("/")
    public int save(@RequestBody Offre e) {
        return service.save(e);
    }
    @GetMapping("/{id}")
    public Offre findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
    @GetMapping("/")
    public List<Offre> findAll() {
        return service.findAll();
    }
    @PutMapping("/")
    public ResponseEntity<Offre> updateOffre(@RequestBody Offre offre) {
        Offre uOffre = service.updateoffre(offre);
        return new ResponseEntity(uOffre, HttpStatus.OK);
    }
}
