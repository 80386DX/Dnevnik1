package com.boki.elektronskiDnevnik.repository;
import com.boki.elektronskiDnevnik.entity.Autorizacija;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorizacijaRepo extends JpaRepository <Autorizacija, Integer> {
    
    List <Autorizacija> findByRang(String rang);
}
