package com.boki.elektronskiDnevnik.service;

import com.boki.elektronskiDnevnik.entity.Korisnici;
import com.boki.elektronskiDnevnik.repository.KorisniciRepo;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class KorisniciService {
    
    //@Autowired
    KorisniciRepo repo;
    
    public List<Korisnici> listAll() {
        return repo.findAll();
    }
    
    public Korisnici saveKorisnik(Korisnici korisnik){
      return  repo.save(korisnik);
    }
    
    public Korisnici getKorisnikById (Integer id){
      return  repo.findById(id).get();
    }
    
    public void deleteKorisnik(Integer id){
        repo.deleteById(id);
    }
 
    
}
