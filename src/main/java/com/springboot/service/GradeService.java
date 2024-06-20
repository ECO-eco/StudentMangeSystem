package com.springboot.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.pojo.Course;
import com.springboot.pojo.Grade;
import org.springframework.stereotype.Service;
import com.springboot.dao.gradeMapper;
import com.springboot.dao.studentMapper;
import javax.annotation.Resource;
import java.util.List;

@Service("GradeService")
public class GradeService {
    @Resource(name = "gradeMapper")
    private gradeMapper gradeMapper;
    @Resource(name = "studentMapper")
    private studentMapper studentMapper;
    public PageInfo<Grade> queryAll(int pageNum){
        PageHelper.startPage(pageNum,5);
        return new PageInfo<Grade>(gradeMapper.queryAll());
    }
    public int deleteGrade(String stuNumber,int couId){
        return gradeMapper.deleteGrade(stuNumber,couId);
    }
    public List<Course> queryElect(String stuNumber){
        String major=studentMapper.queryByNum(stuNumber).getMajor();
        return gradeMapper.queryElect(stuNumber, major);
    }
    public int addGrade(Grade grade){
        return gradeMapper.addGrade(grade);
    }
    public Grade queryByNum(String stuNumber,int couId){
        return gradeMapper.queryByNum(stuNumber,couId);
    }
    public List<Course> querySingle(String searchContent){
        return gradeMapper.querySingle(searchContent);
    }
    public int updateGrade(Grade grade){
        return gradeMapper.updateGrade(grade);
    }
 }
