package org.ensembl.exporter.controllers;

import org.ensembl.exporter.entities.FileUpload;
import org.ensembl.exporter.repositories.FileUploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/file-uploads")
public class FileUploadController {

    private final FileUploadRepository fileUploadRepository;

    @Autowired
    public FileUploadController(FileUploadRepository fileUploadRepository) {
        this.fileUploadRepository = fileUploadRepository;
    }

    @GetMapping
    public ResponseEntity<List<FileUpload>> getAllFileUploads() {
        List<FileUpload> fileUploads = fileUploadRepository.findAll();
        return ResponseEntity.ok(fileUploads);
    }
}
