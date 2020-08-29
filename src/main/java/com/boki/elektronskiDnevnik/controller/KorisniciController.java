package com.boki.elektronskiDnevnik.controller;

import com.boki.elektronskiDnevnik.entity.Korisnici;
import com.boki.elektronskiDnevnik.exception.ResourceNotFoundException;
import com.boki.elektronskiDnevnik.repository.KorisniciRepo;
import com.boki.elektronskiDnevnik.service.KorisniciService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/korisnici")
public class KorisniciController {
    
    KorisniciService service;
    KorisniciRepo repo;
    
    @GetMapping
    public List < Korisnici > getAllUsers() {
        return service.listAll();
    }
   
    /*
    @GetMapping("/{id}")
    public Korisnici getKorisnikById (@PathVariable (value = "id")Integer id_korisnici){
        return service.getKorisnikById(id_korisnici).oeElseThrow(()->new ResourceNotFoundException("Nije pronadjen :" + id_korisnici);
    }
    */
    @PostMapping
    public  Korisnici createUser(@RequestBody Korisnici korisnik) {
        return repo.save(korisnik);
    }

}
