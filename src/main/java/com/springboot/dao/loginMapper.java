package com.springboot.dao;

import com.springboot.pojo.Login;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("loginMapper")
public interface loginMapper {
    int addUser(Login login);
    List<Login> queryByEmail(String email);
    int queryValid(String email);
    int updateValid(String confirmCode);
    Login queryTime(String confirmCode);

}
