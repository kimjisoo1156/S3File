package com.example.S3File.repository;

import com.example.S3File.domain.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileEntity,Long> {
}
