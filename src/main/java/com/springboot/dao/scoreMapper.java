package com.springboot.dao;

import com.springboot.pojo.score.AllPoint;
import com.springboot.pojo.score.Personal;
import com.springboot.pojo.score.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository("scoreMapper")
public interface scoreMapper {
    List<Subject> queryByName(String couName);
    List<Personal> queryByNum(String stuNumber);
    List<AllPoint> queryByMajor(String major);
}
