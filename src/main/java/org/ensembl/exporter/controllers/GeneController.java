package org.ensembl.exporter.controllers;

import org.ensembl.exporter.entities.*;
import org.ensembl.exporter.repositories.GeneRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/genes")
public class GeneController {

    private final GeneRepository geneRepository;

    public GeneController(GeneRepository geneRepository) {
        this.geneRepository = geneRepository;
    }

    @GetMapping
    public ResponseEntity<List<Gene>> getAllGenes() {
        List<Gene> genes = geneRepository.findAll();
		return ResponseEntity.ok(genes);
    }
}