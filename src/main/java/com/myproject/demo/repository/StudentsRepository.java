package com.myproject.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.myproject.demo.model.Students;

public interface StudentsRepository extends CrudRepository<Students, Integer>{

}
