package com.boki.elektronskiDnevnik.repository;
import com.boki.elektronskiDnevnik.entity.Rasporedi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RasporediRepo extends JpaRepository <Rasporedi, Integer> {
    
}
