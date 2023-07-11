package org.ensembl.exporter.controllers;

import org.ensembl.exporter.entities.Study;
import org.ensembl.exporter.repositories.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/studies")
public class StudyController {

    private final StudyRepository studyRepository;

    @Autowired
    public StudyController(StudyRepository studyRepository) {
        this.studyRepository = studyRepository;
    }

    @GetMapping
    public ResponseEntity<List<Study>> getAllStudies() {
        List<Study> studies = studyRepository.findAll();
        return ResponseEntity.ok(studies);
    }
}