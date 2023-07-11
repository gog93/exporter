package org.ensembl.exporter.controllers;

import org.ensembl.exporter.entities.Disease;
import org.ensembl.exporter.repositories.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/diseases")
public class DiseaseController {

    private final DiseaseRepository diseaseRepository;

    @Autowired
    public DiseaseController(DiseaseRepository diseaseRepository) {
        this.diseaseRepository = diseaseRepository;
    }

    @GetMapping
    public ResponseEntity<List<Disease>> getAllDiseases() {
        List<Disease> diseases = diseaseRepository.findAll();
        return ResponseEntity.ok(diseases);
    }
}