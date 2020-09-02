package com.boki.elektronskiDnevnik.controller;

import com.boki.elektronskiDnevnik.entity.Korisnici;
import com.boki.elektronskiDnevnik.exception.ResourceNotFoundException;
import com.boki.elektronskiDnevnik.repository.KorisniciRepo;
import com.boki.elektronskiDnevnik.service.KorisniciService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
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
   // KorisniciRepo repo;
    
    @GetMapping
    public List < Korisnici > getAllUsers() {
        return service.listAll();
    }
   
    /*
    @GetMapping("/{id}")
    public Korisnici getKorisnikById (@PathVariable (value = "id")Integer id_korisnici){
        if(!id_korisnici = isPresent())
        return repo.getOne(id_korisnici)
                
                //.orElseThrow(()-> new ResourceNotFoundException("Ne postoji :" +id_korisnici));
    }
*/
    @GetMapping("/{id}")
    public Korisnici getUserById(@PathVariable Integer id){
        return service.getKorisnikById(id);
    }
   
    
    @PostMapping
    public  Korisnici createUser(@RequestBody Korisnici korisnik) {
        return service.saveKorisnik(korisnik);
    }
    
    @DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Integer id) {
		service.deleteKorisnik(id);
	}

}
