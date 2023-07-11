package org.ensembl.exporter.repositories;

import org.ensembl.exporter.entities.MetaAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaAnalysisRepository extends JpaRepository<MetaAnalysis, Long> {
}
