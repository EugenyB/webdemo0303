package com.example.webdemo0303.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.webdemo0303.entities.Subject} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDto implements Serializable {
    private Long id;
    private String title;
    private Integer length;
}