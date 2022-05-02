package com.examly.springapp.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.Academy;
import com.examly.springapp.service.AcademyService;

import java.util.List;


@RestController
@RequestMapping("/academy")
public class AcademyResource {

    private final AcademyService academyService;

    public AcademyResource(AcademyService academyService) {
        this.academyService = academyService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Academy>> getAllAcademys () {
        List<Academy> academy = academyService.findAllAcademys();
        return new ResponseEntity<>(academy, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Academy> getAcademyById (@PathVariable("id") Long id) {
        Academy academy = academyService.findAcademyById(id);
        return new ResponseEntity<>(academy, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Academy> addAcademy(@RequestBody Academy academy) {
        Academy newAcademy = academyService.addAcademy(academy);
        return new ResponseEntity<>(newAcademy, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Academy> updateAcademy(@RequestBody Academy academy) {
        Academy updateAcademy = academyService.updateAcademy(academy);
        return new ResponseEntity<>(updateAcademy, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAcademy(@PathVariable("id") Long id) {
        academyService.deleteAcademy(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
