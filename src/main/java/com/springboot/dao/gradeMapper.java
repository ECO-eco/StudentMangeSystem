package com.springboot.dao;

import com.springboot.pojo.Course;
import com.springboot.pojo.Grade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("gradeMapper")
public interface gradeMapper {
    List<Grade> queryAll();
    int addGrade(Grade grade);
    int deleteGrade(String stuNumber,int couId);
    List<Course> queryElect(String stuNumber, String major);
    Grade queryByNum(String stuNumber,int couId);
    int updateGrade(Grade grade);
    List<Course> querySingle(String searchContent);
}
