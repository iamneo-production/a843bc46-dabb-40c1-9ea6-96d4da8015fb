package com.examly.springapp.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.springapp.model.Academy;


import java.util.Optional;

public interface AcademyRepo extends JpaRepository<Academy, Long> {
    public void deleteAcademyById(Long id);
    public Optional<Academy> findAcademyById(Long id);
    
}
    
