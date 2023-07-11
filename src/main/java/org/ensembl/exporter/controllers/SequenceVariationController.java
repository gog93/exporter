package org.ensembl.exporter.controllers;

import org.ensembl.exporter.entities.SequenceVariation;
import org.ensembl.exporter.repositories.SequenceVariationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sequence-variations")
public class SequenceVariationController {

    private final SequenceVariationRepository sequenceVariationRepository;

    @Autowired
    public SequenceVariationController(SequenceVariationRepository sequenceVariationRepository) {
        this.sequenceVariationRepository = sequenceVariationRepository;
    }

    @GetMapping
    public ResponseEntity<List<SequenceVariation>> getAllSequenceVariations() {
        List<SequenceVariation> sequenceVariations = sequenceVariationRepository.findAll();
        return ResponseEntity.ok(sequenceVariations);
    }
}
