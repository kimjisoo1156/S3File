package com.example.S3File.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileResponseDto {
    private String fileName;
    private String url;
    private String uuid;
}
