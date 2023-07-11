package org.ensembl.exporter.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "meta_study_relations")
public class MetaStudyRelation {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "meta_analysis_id", nullable = false)
    private MetaAnalysis metaAnalysis;

    @ManyToOne
    @JoinColumn(name = "study_id", nullable = false)
    private Study study;
}
