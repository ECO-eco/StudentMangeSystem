package com.springboot.service;

import com.springboot.pojo.score.AllPoint;
import com.springboot.pojo.score.Personal;
import com.springboot.pojo.score.Subject;
import org.springframework.stereotype.Service;
import com.springboot.dao.scoreMapper;
import javax.annotation.Resource;
import java.util.List;

@Service("ScoreService")
public class ScoreService {
    @Resource(name = "scoreMapper")
    private scoreMapper scoreMapper;
    private List<Personal> personalList=null;
    public List<Subject> queryByName(String couName){
        return scoreMapper.queryByName(couName);
    }
    public List<Personal> queryByNum(String stuNumber){
        personalList=scoreMapper.queryByNum(stuNumber);
        return personalList;
    }
    public List<AllPoint> queryByMajor(String major){
        return scoreMapper.queryByMajor(major);
    }
    public float countPoint(){
        float sum=0;
        for (Personal person:personalList) {
            sum+=person.getPoint();
        }
        return sum/personalList.size();
    }
}
