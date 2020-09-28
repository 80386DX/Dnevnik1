package com.boki.elektronskiDnevnik.repository;
import com.boki.elektronskiDnevnik.entity.Korisnici;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KorisniciRepo extends JpaRepository <Korisnici, Integer> {
    
    
    Optional<Korisnici> findById(Integer id);
    
    
}
