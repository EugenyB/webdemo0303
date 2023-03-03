package com.example.webdemo0303.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.webdemo0303.entities.Teacher} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto implements Serializable {
    private Long id;
    private String name;
    private Integer experience;
    private String subjects;
}