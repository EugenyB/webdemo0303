package com.example.webdemo0303.utils;

import com.example.webdemo0303.dto.TeacherDto;
import com.example.webdemo0303.entities.Subject;
import com.example.webdemo0303.entities.Teacher;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.stream.Collectors;

@Named
@ApplicationScoped
public class TeacherConvertor {
    public TeacherDto teacherToTeacherDto(Teacher teacher) {
        String subjects = teacher.getSubjects().stream().map(Subject::getTitle).collect(Collectors.joining(", "));
        return new TeacherDto(teacher.getId(), teacher.getName(), teacher.getExperience(), subjects);
    }

    public Teacher teacherDtoToTeacher(TeacherDto dto) {
        Teacher teacher = new Teacher();
        teacher.setId(dto.getId());
        teacher.setName(dto.getName());
        teacher.setExperience(dto.getExperience());
        return teacher;
    }
}
