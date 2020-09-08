package com.boki.elektronskiDnevnik.service;

import com.boki.elektronskiDnevnik.entity.Dani;
import com.boki.elektronskiDnevnik.repository.DaniRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaniService {
    
    DaniRepo repo;
    
    @Autowired
    public DaniService (DaniRepo repo){
     this.repo = repo ;
    }
   
    public List<Dani> listAll() {
        return repo.findAll();
    }
    
    public void save(Dani dani){
        repo.save(dani);
    }
    
    public void getById (Integer id){
        repo.findById(id);
    }
    
    public void delete(Integer id){
        repo.deleteById(id);
    }
}
