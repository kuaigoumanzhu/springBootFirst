package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IGrilRepository extends JpaRepository<Girl,Integer> {
    // 通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
