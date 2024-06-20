package com.springboot.dao;

import com.springboot.pojo.Dorm;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("dormMapper")
public interface dormMapper {
    List<Dorm> queryAll();
    Dorm querySingle(String dormAddress,int dormNum);
    Dorm queryById(int dormId);
    int addDorm(Dorm dorm);
    int updateDorm(Dorm dorm);
    int deleteDorm(int dormId);
}
