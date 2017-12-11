package com.cjq.girl.controller;

import com.cjq.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Value("${cupSize}")//通过注解获取application中的值
    private  String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${context}")
    private String context;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return  "id:"+id;
        //return girlProperties.getCupSize();
    }
}
