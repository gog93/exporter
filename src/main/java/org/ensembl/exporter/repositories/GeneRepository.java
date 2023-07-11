package org.ensembl.exporter.repositories;

import org.ensembl.exporter.entities.Gene;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneRepository extends JpaRepository<Gene, Integer> {

    // Define your custom queries here if needed

}
