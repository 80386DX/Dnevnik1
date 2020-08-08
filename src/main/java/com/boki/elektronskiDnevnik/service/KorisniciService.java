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
    
    public void save(Korisnici korisnik){
        repo.save(korisnik);
    }
    
    public void getById (Integer id){
        repo.findById(id);
    }
    
    public void delete(Integer id){
        repo.deleteById(id);
    }
    
}
