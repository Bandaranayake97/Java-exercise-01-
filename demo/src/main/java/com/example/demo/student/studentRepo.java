package com.example.demo.student;

import org.springframework.data.repository.CrudRepository;

public interface studentRepo extends CrudRepository<userstudent,Integer> {
    public Long countById(Integer id);
}
