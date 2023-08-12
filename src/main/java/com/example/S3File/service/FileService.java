package com.example.S3File.service;

import com.example.S3File.domain.FileEntity;
import com.example.S3File.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FileService {
    private final FileRepository fileRepository;

    public FileEntity save(FileEntity fileEntity) {
        return fileRepository.save(fileEntity);
    }

    public List<FileEntity> getFiles() {
        List<FileEntity> all = fileRepository.findAll();
        return all;
    }
    public FileEntity getFileById(Long id) {
        return fileRepository.findById(id).orElse(null);
    }

    public void deleteFileById(Long id) {
        fileRepository.deleteById(id);
    }
}
