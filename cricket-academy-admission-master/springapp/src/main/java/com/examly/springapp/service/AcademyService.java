package com.examly.springapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.exception.UserNotFoundException;
import com.examly.springapp.model.Academy;
import com.examly.springapp.repo.AcademyRepo;


import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class AcademyService {

    private final AcademyRepo academyRepo;

    @Autowired
    public AcademyService(AcademyRepo academyRepo) {
        this.academyRepo = academyRepo;
    }

    public Academy addAcademy(Academy academy) {
        return academyRepo.save(academy);
    }

    public List<Academy> findAllAcademys() {
        return academyRepo.findAll();
    }

    public Academy updateAcademy(Academy academy) {
        return academyRepo.save(academy);
    }

    public Academy findAcademyById(Long id) {
        return academyRepo.findAcademyById(id)
                .orElseThrow(() -> new UserNotFoundException("Academy by id " + id + " was not found"));
    }

    public void deleteAcademy(Long id){
        academyRepo.deleteAcademyById(id);
    }
    
}
