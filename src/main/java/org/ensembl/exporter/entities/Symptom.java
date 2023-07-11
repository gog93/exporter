package org.ensembl.exporter.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "symptoms")
public class Symptom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category", nullable = false)
    private Integer category;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "definition")
    private String definition;

    @Column(name = "import_header", nullable = false)
    private String importHeader;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "name1", unique = true)
    private String name1;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "sign_name")
    private String signName;
}
