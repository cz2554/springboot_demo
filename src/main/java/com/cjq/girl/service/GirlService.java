package com.cjq.girl.service;

import com.cjq.girl.domain.Girl;
import com.cjq.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    public  void insertTwo(){
        Girl girla=new Girl();
        girla.setAge(18);
        girla.setCupSize("C");
        girlRepository.save(girla);

        Girl girlb=new Girl();
        girlb.setAge(19);
        girlb.setCupSize("D");
        girlRepository.save(girlb);


    }
}
