package com.boki.elektronskiDnevnik.repository;
import com.boki.elektronskiDnevnik.entity.Ocene;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OceneRepo extends JpaRepository <Ocene, Integer> {
    
}
