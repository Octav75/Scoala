package com.sda.springmvc.example.repositories;

import com.sda.springmvc.example.entities.CourseModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface CourseModelRepository extends CrudRepository<CourseModel, Long> {
    List<CourseModel> findAll();
    List<CourseModel> findByName(String name);
}
