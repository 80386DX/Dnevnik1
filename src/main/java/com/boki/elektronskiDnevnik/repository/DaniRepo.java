package com.boki.elektronskiDnevnik.repository;
import com.boki.elektronskiDnevnik.entity.Dani;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface DaniRepo extends JpaRepository <Dani, Integer> {
    
    Optional <Dani> findByName(String ime);
}
