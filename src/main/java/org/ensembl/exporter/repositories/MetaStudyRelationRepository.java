package org.ensembl.exporter.repositories;

import org.ensembl.exporter.entities.MetaStudyRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaStudyRelationRepository extends JpaRepository<MetaStudyRelation, Long> {
}
