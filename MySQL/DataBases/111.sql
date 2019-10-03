CREATE database company1;

use company1;

CREATE TABLE departments (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name_depart VARCHAR(200)
);

CREATE TABLE employees(
	id INT AUTO_INCREMENT PRIMARY KEY,
    firnst_name VARCHAR (50),
    last_name VARCHAR (50),
    id_dep INT,
    job_type VARCHAR(100),
    FOREIGN KEY (id_dep) REFERENCES departments(id)
);

SELECT * FROM departments;

INSERT INTO departments (name_depart)
VALUES ("Financiar");

INSERT INTO departments (name_depart)
VALUES 
		("HR"),
		("IT"),
        ("Legal");
        
INSERT INTO employees (firnst_name, last_name, id_dep, job_type)
VALUES("Ion", "Ionut", 1, "Manager");

SELECT * FROM employees;
