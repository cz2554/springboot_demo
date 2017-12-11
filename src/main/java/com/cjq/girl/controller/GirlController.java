package com.cjq.girl.controller;

import com.cjq.girl.domain.Girl;
import com.cjq.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping("/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    /**
     * 添加一个女生
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping("/girls")
    public Girl addGirl(String cupSize,Integer age){
        Girl girl=new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    /**
     * 通过id获取一个女生
     * @param id
     * @return
     */
    @GetMapping("/girls/{id}")
    public Girl girlFindOne(@PathVariable(value = "id") Integer id){
        return  girlRepository.findOne(id);
    }

    /**
     * 通过id更新一个女生
     * @param id
     * @param cupSize
     * @param age
     * @return
     */
    @PutMapping("/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,String cupSize,Integer age){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    /**
     * 通过id删除一个女生
     * @param id
     * @param cupSize
     * @param age
     */
    @DeleteMapping("/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id,String cupSize,Integer age){
        girlRepository.delete(id);
    }

    /**
     * 通过年龄查询女生
     * @param age
     * @return
     */
    @GetMapping("/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }
}
