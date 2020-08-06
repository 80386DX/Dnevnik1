package com.boki.elektronskiDnevnik.repository;
import com.boki.elektronskiDnevnik.entity.Korisnici;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KorisniciRepo extends JpaRepository <Korisnici, Integer> {
    
}
