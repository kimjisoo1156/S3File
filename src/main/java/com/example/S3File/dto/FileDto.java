package com.example.S3File.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;
@Getter
@Setter
public class FileDto {
    private MultipartFile file;
}
