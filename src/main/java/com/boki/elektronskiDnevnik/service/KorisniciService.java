package com.boki.elektronskiDnevnik.service;

import com.boki.elektronskiDnevnik.entity.Korisnici;
import com.boki.elektronskiDnevnik.repository.KorisniciRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class KorisniciService {
    
    //@Autowired
    KorisniciRepo repo;
    
    //Constructor dependency
    @Autowired
    public KorisniciService(KorisniciRepo repo) {
    this.repo = repo;
}
    
    public List<Korisnici> listAll() {
        return repo.findAll();
    }
    
    public Korisnici saveKorisnik(Korisnici korisnik){
      return  repo.save(korisnik);
    }
    
    public Korisnici getKorisnikById (Integer id){
      return  repo.findById(id).get();
    }
    /*
    public Korisnici updateKorisnik(Integer id, Korisnici korisnik){
        Korisnici updKorisnik = repo.findById(id);
    }
    */
    public void deleteKorisnik(Integer id){
        repo.deleteById(id);
    }
 
    
}
