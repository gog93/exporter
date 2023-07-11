package org.ensembl.exporter.repositories;

import org.ensembl.exporter.entities.SequenceVariation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SequenceVariationRepository extends JpaRepository<SequenceVariation, Long> {
}
