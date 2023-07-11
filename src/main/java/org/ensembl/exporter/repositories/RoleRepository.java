package org.ensembl.exporter.repositories;

import org.ensembl.exporter.entities.Disease;
import org.ensembl.exporter.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
