SELECT * FROM mysqlcosmin.persons;

INSERT INTO `mysqlcosmin`.`persons` (`first_name`, `last_name`, `birth_date`) 
VALUES ('Aa', 'Bn', '1966-03-22');

select count(*) as 'person_count' 
from mysqlcosmin.persons;

select count(birth_date) as 'persons count, that have date of birthed filled'
from mysqlcosmin.persons;

delimiter $$
create function add_two_ints(
a int, -- parameter a of type int 
b int -- parameter b of type int
) returns int
begin
return a + b;
end$$
select add_two_ints(3, 5);

DELIMITER $$ -- TRIGGER
CREATE TRIGGER store_employee BEFORE UPDATE ON employees
	FOR EACH ROW
    BEGIN 
		INSERT INTO employees_history
        VALUES (new.id, NOW(),
        old.first_name, old.last_name,
        new.first_name, new.last_name);
	END$$
UPDATE employees SET first_name='Lucky' WHERE first_name='Kate';


