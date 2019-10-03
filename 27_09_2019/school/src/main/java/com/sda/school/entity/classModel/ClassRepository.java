package com.sda.school.entity.classModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassModel, String> {
    ClassModel findByName (String name);
}
