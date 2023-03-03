package com.example.webdemo0303.beans;

import com.example.webdemo0303.dao.TeacherDao;
import com.example.webdemo0303.dto.TeacherDto;
import com.example.webdemo0303.utils.TeacherConvertor;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
@Data
public class TeacherBean implements Serializable {

    @EJB
    private TeacherDao teacherDao;

    @Inject
    private TeacherConvertor teacherConvertor;

    private TeacherDto teacher = new TeacherDto();

    public List<TeacherDto> getTeachers() {
        return teacherDao.findAll()
                .stream()
                .map(teacherConvertor::teacherToTeacherDto)
                .toList();
    }

    public void add() {
        teacherDao.add(teacherConvertor.teacherDtoToTeacher(teacher));
        teacher = new TeacherDto();
    }
}
