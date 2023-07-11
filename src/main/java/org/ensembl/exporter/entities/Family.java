package org.ensembl.exporter.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "families")
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Boolean history;

    @Column(name = "num_het_mut_affected")
    private Integer numberOfHeterozygousMutationsAffected;

    @Column(name = "num_hom_mut_affected")
    private Integer numberOfHomozygousMutationsAffected;

    @Column(name = "num_het_mut_unaffected")
    private Integer numberOfHeterozygousMutationsUnaffected;

    @Column(name = "num_hom_mut_unaffected")
    private Integer numberOfHomozygousMutationsUnaffected;

    @Column(name = "num_wildtype_affected")
    private Integer numberOfWildtypeAffected;

    @Column(name = "num_wildtype_unaffected")
    private Integer numberOfWildtypeUnaffected;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    private Boolean consanguinity;
}