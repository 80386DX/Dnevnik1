package com.boki.elektronskiDnevnik.repository;
import com.boki.elektronskiDnevnik.entity.Odeljenja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OdeljenjaRepo extends JpaRepository <Odeljenja, Integer> {
    
}
