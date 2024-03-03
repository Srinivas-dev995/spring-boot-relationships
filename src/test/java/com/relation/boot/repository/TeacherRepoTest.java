package com.relation.boot.repository;

import com.relation.boot.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepoTest {

    @Autowired
    private TeacherRepo teacherRepo;

    @Test
    public void saveTeacher(){

    }
}