package com.sda.school.entity.student;

import com.sda.school.entity.AbstractModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter // de la lobok si le face el automat!!!
@Setter
public class StudentModel extends AbstractModel {
    @Id
    // IDENTITY AUTOGENEREAZA in MySql intrarile
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


}
