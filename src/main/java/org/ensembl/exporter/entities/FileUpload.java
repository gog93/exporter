package org.ensembl.exporter.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "file_uploads")
public class FileUpload {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tsv_file_file_name")
    private String tsvFileFileName;

    @Column(name = "tsv_file_content_type")
    private String tsvFileContentType;

    @Column(name = "tsv_file_file_size")
    private Integer tsvFileFileSize;

    @Column(name = "tsv_file_updated_at")
    private LocalDateTime tsvFileUpdatedAt;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    private String description;

    @ManyToOne
    @JoinColumn(name = "study_id")
    private Study study;
}
