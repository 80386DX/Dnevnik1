package com.boki.elektronskiDnevnik.service;

import com.boki.elektronskiDnevnik.entity.Rasporedi;
import com.boki.elektronskiDnevnik.repository.RasporediRepo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RasporediService {
    
    RasporediRepo repo;
    
    public List<Rasporedi> listAll() {
        return repo.findAll();
    }
    
    public void save(Rasporedi rasporedi){
        repo.save(rasporedi);
    }
    
    public void getById (Integer id){
        repo.findById(id);
    }
    
    public void delete(Integer id){
        repo.deleteById(id);
    }
    
}
