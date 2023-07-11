package org.ensembl.exporter.controllers;

import org.ensembl.exporter.entities.MetaAnalysis;
import org.ensembl.exporter.repositories.MetaAnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/meta-analyses")
public class MetaAnalysisController {

    private final MetaAnalysisRepository metaAnalysisRepository;

    @Autowired
    public MetaAnalysisController(MetaAnalysisRepository metaAnalysisRepository) {
        this.metaAnalysisRepository = metaAnalysisRepository;
    }

    @GetMapping
    public ResponseEntity<List<MetaAnalysis>> getAllMetaAnalyses() {
        List<MetaAnalysis> metaAnalyses = metaAnalysisRepository.findAll();
        return ResponseEntity.ok(metaAnalyses);
    }
}
