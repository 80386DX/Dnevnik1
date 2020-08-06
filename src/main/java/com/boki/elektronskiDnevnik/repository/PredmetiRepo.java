package com.boki.elektronskiDnevnik.repository;
import com.boki.elektronskiDnevnik.entity.Predmeti;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredmetiRepo extends JpaRepository <Predmeti, Integer> {
    
}
