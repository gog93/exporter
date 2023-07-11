package org.ensembl.exporter.repositories;

import org.ensembl.exporter.entities.PatientsSymptoms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsSymptomsRepository extends JpaRepository<PatientsSymptoms, Long> {
}
