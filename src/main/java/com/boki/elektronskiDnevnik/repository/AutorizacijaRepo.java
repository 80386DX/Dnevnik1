package com.boki.elektronskiDnevnik.repository;
import com.boki.elektronskiDnevnik.entity.Autorizacija;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorizacijaRepo extends JpaRepository <Autorizacija, Integer> {
    
}
