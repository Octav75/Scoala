create database shop;   -- creeare BD
use shop;

create table Products(
product_id integer not null auto_increment primary key,
product_name varchar(100),
product_code int not null,
price float not null,
quantity int not null);

select * from Products;

ALTER TABLE Products modify COLUMN price double (10,2);  -- PENTRU suppliersproductsA MODIFICA TIPUL 
-- PRETULUI PENTRU A AVEA MAXIM 10 NUMERE INAINTE DE VIRGULA SI NUMAI 2 NUMERE

insert into Products (product_name, product_code, price, quantity)
values ('sampon', 020, 11, 5),
		('apa', 212, 1.5, 100),
        ('guma', 932, 2, 30),
        ('camel', 333, 17, 100);
        
insert into Products (product_id, product_name, product_code, price, quantity)
values (null, 'scripete', 123, 50, 4),
		(null, 'cuie', 154, 1, 1000);  -- am pus NULL pentru ca product_id este autoincrement si PK
        
create table Suppliers(
supplier_id integer not null auto_increment primary key,
supplier_name varchar(200));

select * from Suppliers;

insert into Suppliers (supplier_name)
values ('Borsec'),
		('Dorna'),
        ('Biborteni'),
        ('Brithish American Tabaco'),
        ('Turbo'),
        ('HubaBuba'),
        ('Nivea');

ALTER TABLE Products ADD COLUMN supplier_id INT;  -- pentru inceput trebuie sa aduc coloana supplier_id in talela Products
-- deoarece altfel imi da eroare la momentul cand ii aduc FOREIGN KEY din Suppliers
ALTER TABLE Products ADD FOREIGN KEY (supplier_id) REFERENCES Suppliers(supplier_id); -- am adus in tabela de produse
-- o coloana noua care este FOREIGN KEY pentru supplers pe care o apelam din Products

UPDATE Products SET supplier_id = 7 WHERE product_id = 1;
UPDATE Products SET supplier_id = 1 WHERE product_id = 2;
UPDATE Products SET supplier_id = 6 WHERE product_id = 3;
UPDATE Products SET supplier_id = 4 WHERE product_id = 4;
UPDATE Products SET supplier_id = 5 WHERE product_id = 5;
UPDATE Products SET supplier_id = 3 WHERE product_id = 6;

select prod.supplier_id, prod.product_name, prod.price, prod.quantity from Products prod
order by prod.supplier_id;

select prod.supplier_id, prod.product_name, prod.price, prod.quantity from Products prod
order by prod.price desc;

select prod.product_id, prod.product_name, prod.price, prod.quantity, supp.supplier_name, prod.supplier_id 
from Products prod
inner join Suppliers supp
on prod.supplier_id = supp.supplier_id
order by product_id asc;

select prod.price * prod.quantity from Products prod;



