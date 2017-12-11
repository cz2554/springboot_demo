package com.cjq.girl.repository;

import com.cjq.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    /**
     * 通过年龄查询女生
     * @param age
     * @return
     */
    public List<Girl> findByAge(Integer age);
}
