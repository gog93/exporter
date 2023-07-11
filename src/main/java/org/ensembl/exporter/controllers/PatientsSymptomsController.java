package org.ensembl.exporter.controllers;

import org.ensembl.exporter.entities.PatientsSymptoms;
import org.ensembl.exporter.repositories.PatientsSymptomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/patients-symptoms")
public class PatientsSymptomsController {

    private final PatientsSymptomsRepository patientsSymptomsRepository;

    @Autowired
    public PatientsSymptomsController(PatientsSymptomsRepository patientsSymptomsRepository) {
        this.patientsSymptomsRepository = patientsSymptomsRepository;
    }

    @GetMapping
    public ResponseEntity<List<PatientsSymptoms>> getAllPatientsSymptoms() {
        List<PatientsSymptoms> patientsSymptoms = patientsSymptomsRepository.findAll();
        return ResponseEntity.ok(patientsSymptoms);
    }
}
