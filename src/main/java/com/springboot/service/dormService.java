package com.springboot.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.pojo.Dorm;
import org.springframework.stereotype.Service;
import com.springboot.dao.dormMapper;
import javax.annotation.Resource;

@Service("dormService")
public class dormService {
    @Resource(name = "dormMapper")
    private dormMapper dormMapper;
    public PageInfo<Dorm> queryAll(int pageNum){
        PageHelper.startPage(pageNum,6);
        return new PageInfo<Dorm>(dormMapper.queryAll());
    }
    public int addDorm(Dorm dorm){
        return dormMapper.addDorm(dorm);
    }
    public int updateDorm(Dorm dorm){
        return dormMapper.updateDorm(dorm);
    }
    public int deleteDorm(int dormId){
        return dormMapper.deleteDorm(dormId);
    }
    public Dorm queryById(int dormId){
        return dormMapper.queryById(dormId);
    }
    public Dorm querySingle(String dormName){
        String dormAddress;
        int dormNum,index=0;
        for(int i=0;i<dormName.length();i++){
            if(!(19968<=(int)dormName.charAt(i)&&(int)dormName.charAt(i)<=40869)){
                index=dormName.indexOf(dormName.charAt(i));
                break;
            }
        }
        dormAddress=dormName.substring(0,index);
        dormNum=Integer.parseInt(dormName.substring(index));
        return dormMapper.querySingle(dormAddress,dormNum);

    }
}
