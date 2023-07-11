package org.ensembl.exporter.controllers;

import org.ensembl.exporter.entities.Symptom;
import org.ensembl.exporter.repositories.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/symptoms")
public class SymptomController {

    private final SymptomRepository symptomRepository;

    @Autowired
    public SymptomController(SymptomRepository symptomRepository) {
        this.symptomRepository = symptomRepository;
    }

    @GetMapping
    public ResponseEntity<List<Symptom>> getAllSymptoms() {
        List<Symptom> symptoms = symptomRepository.findAll();
        return ResponseEntity.ok(symptoms);
    }
}
