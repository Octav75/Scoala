package com.sda.school.entity;

import javax.persistence.Column;
import java.security.Timestamp;

public class AbstractModel {

    @Column(nullable = false, updatable = false, insertable = false,
    columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Timestamp created;

    protected Timestamp updated;

}
