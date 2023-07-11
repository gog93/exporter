package org.ensembl.exporter.controllers;

import org.ensembl.exporter.entities.MetaStudyRelation;
import org.ensembl.exporter.repositories.MetaStudyRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/meta-study-relations")
public class MetaStudyRelationController {

    private final MetaStudyRelationRepository metaStudyRelationRepository;

    @Autowired
    public MetaStudyRelationController(MetaStudyRelationRepository metaStudyRelationRepository) {
        this.metaStudyRelationRepository = metaStudyRelationRepository;
    }

    @GetMapping
    public ResponseEntity<List<MetaStudyRelation>> getAllMetaStudyRelations() {
        List<MetaStudyRelation> metaStudyRelations = metaStudyRelationRepository.findAll();
        return ResponseEntity.ok(metaStudyRelations);
    }
}
