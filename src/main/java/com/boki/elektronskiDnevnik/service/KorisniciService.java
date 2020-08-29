package com.boki.elektronskiDnevnik.service;

import com.boki.elektronskiDnevnik.entity.Korisnici;
import com.boki.elektronskiDnevnik.repository.KorisniciRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KorisniciService {
    
    //@Autowired
    KorisniciRepo repo;
    
    public List<Korisnici> listAll() {
        return repo.findAll();
    }
    
    public void saveKorisnik(Korisnici korisnik){
        repo.save(korisnik);
    }
    
    public void getKorisnikById (Integer id){
        repo.findById(id);
    }
    
    public void deleteKorisnik(Integer id){
        repo.deleteById(id);
    }
 
    
}
