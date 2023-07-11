package org.ensembl.exporter.controllers;

import org.ensembl.exporter.entities.Family;
import org.ensembl.exporter.repositories.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/families")
public class FamilyController {

    private final FamilyRepository familyRepository;

    @Autowired
    public FamilyController(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    @GetMapping
    public ResponseEntity<List<Family>> getAllFamilies() {
        List<Family> families = familyRepository.findAll();
        return ResponseEntity.ok(families);
    }
}