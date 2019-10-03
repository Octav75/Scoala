Select * From product_type;

select Pty.* from product_type as pty;

select emp.first_name, emp.last_name, emp.title from employee emp;

select emp.first_name, emp.last_name, 
CONCAT("emp", emp.EMP_ID ) as emp_No2 from employee emp;

select Pro.PRODUCT_CD, Pro.name, Pro.PRODUCT_TYPE_CD from product Pro;

select DISTINCT Pro.PRODUCT_TYPE_CD from product Pro;

select * from product pro WHERE pro.PRODUCT_TYPE_CD = "loan";

select emp.first_name, emp.last_name, emp.title, emp.DEPT_ID from employee emp
where (emp.FIRST_NAME like "s%" or emp.FIRST_NAME like "p%") AND emp.DEPT_ID=1;

select emp.first_name, emp.last_name, emp.title, emp.DEPT_ID from employee emp
where emp.FIRST_NAME IN ("Susan", "Paula", "Helen", "John");

select emp.EMP_ID, emp.first_name, emp.last_name, emp.title, emp.DEPT_ID from employee emp
where emp.emp_id BETWEEN 5 and 10;

select emp.EMP_ID, emp.first_name, emp.last_name, emp.title, emp.START_DATE,
date_format(Emp.Start_Date,'%d-%m-%Y') as 'Date_format' from employee emp
-- where emp.EMP_ID >= 5 and emp.EMP_ID <= 10;
where emp.START_DATE between str_to_date("03-05-2002", "%d-%m-%Y") And
Str_to_date("09-08-2002", "%d-%m-%Y");

select now();
select curdate();

Select Cus.CUST_ID, Cus.CUST_TYPE_CD, Cus.FED_ID, Cus.STATE from Customer Cus
where Cus.FED_ID  Like "%-__-%";

select pro.product_cd, pro.product_type_cd, pro.name from product pro
order by pro.product_type_cd DESC, pro.name DESC;

select emp.first_name, emp.last_name, emp.title, emp.START_DATE from employee emp
where emp.FIRST_NAME like "s%"
-- Order by emp.START_DATE desc;
Order by 2 DESC;

select acc.ACCOUNT_ID, acc.PRODUCT_CD, 
acc.PENDING_BALANCE, acc. AVAIL_BALANCE from account acc;

select acc.product_cd as product,
		count(acc.PRODUCT_CD) as product_count,
		sum(acc.AVAIL_BALANCE) as available_balance_pc,
        avg(acc.AVAIL_BALANCE) as average_balance_pc
from account acc
where acc.OPEN_BRANCH_ID=1
group by acc.PRODUCT_CD
having count(acc.PRODUCT_CD) > 1;

select * from acc_transaction;

INSERT INTO acc_transaction (txn_id, amount, funds_avail_date, txn_date,
txn_type_cd, account_id, execution_branch_id, teller_emp_id)
VALUES (null, 100.2, now(), now(), "CDT", 2, null, null);

select * from acc_transaction where account_id=2;

INSERT INTO acc_transaction (txn_id, amount, funds_avail_date, txn_date,
txn_type_cd, txn_type_cd, account_id)
select null,
			200,
            acc.open_date,
            acc.open_date,
            acc.product_cd,
            acc.account_id
from account acc
where acc.product_cd="CD";

select * from acc_transaction;

select acc.ACCOUNT_Id, acc.AVAIL_BALANCE, acc.PENDING_BALANCE, acc.CUST_ID
from account acc
where acc.CUST_ID = 1;

UPDATE account
SET AVAIL_BALANCE = AVAIL_BALANCE * 1.02,
	PENDING_BALANCE = PENDING_BALANCE * 1.02
    WHERE CUST_ID = 1;

select AccT.TXN_ID, AccT.ACCOUNT_ID, AccT.AMOUNT, AccT.TXN_TYPE_CD 
from Acc_Transaction AccT
ORDER BY AccT.TXN_ID DESC
LIMIT 2;

-- DELETE FROM ACC_TRANSACTION
-- WHERE TXN_ID = 34 OR TXN_ID = 33;

DELETE FROM ACC_TRANSACTION
WHERE TXN_ID IN (32, 21);

select AccT.TXN_ID, AccT.ACCOUNT_ID, AccT.AMOUNT, AccT.TXN_TYPE_CD 
from Acc_Transaction AccT
ORDER BY AccT.TXN_ID DESC
LIMIT 2;

-- DELETE FROM ACC_TRANSACTION
-- Nu se poate ca nu are Atomicitate si Cossistenta!!!!!!
-- WHERE TXN_ID IN (SELECT TXN_ID FROM Acc_Transaction WHERE TXN_TYPE_CD = 'CD');
 
SELECT COUNT(Acc.ACCOUNT_ID) FROM ACCOUNT Acc;
SELECT COUNT(distinct AccT.ACCOUNT_ID) FROM ACC_TRANSACTION AccT;

SELECT Acc.CUST_ID, COUNT(Acc.ACCOUNT_ID) as No_Accounts FROM ACCOUNT acc
GROUP BY Acc.CUST_ID;

SELECT Acc.CUST_ID, SUM(Acc.AVAIL_BALANCE) FROM ACCOUNT Acc
GROUP BY Acc.CUST_ID;

SELECT AVG(Acc.AVAIL_BALANCE) FROM ACCOUNT Acc
WHERE Acc.PRODUCT_CD = 'SAV';

SELECT Acc.CUST_ID, AVG(Acc.AVAIL_BALANCE) 
FROM ACCOUNT Acc
WHERE Acc.OPEN_BRANCH_ID=1  -- imi pune conditia pentru toti clientii ce au deschis cont intr-o sucursala	
GROUP BY  Acc.CUST_ID;

SELECT MIN(Acc.AVAIL_BALANCE) FROM ACCOUNT Acc
WHERE Acc.PRODUCT_CD = 'SAV';

SELECT Acc.OPEN_BRANCH_ID, MIN(Acc.AVAIL_BALANCE) AS Lowest_Balance,
MAX(Acc.AVAIL_BALANCE) AS Highest_Balance
FROM ACCOUNT Acc
GROUP BY Acc.OPEN_BRANCH_ID
ORDER BY Lowest_Balance desc;

SELECT EMP.EMP_ID, EMP.FIRST_NAME, EMP.LAST_NAME, EMP.DEPT_ID, DEPARTMENT.NAME  -- EXEMPUL DE INNER JOIN
FROM EMPLOYEE EMP 
INNER JOIN DEPARTMENT
ON EMP.DEPT_ID = DEPARTMENT.DEPT_ID
ORDER BY EMP.EMP_ID;

-- LEFT OUTER JOIN (or LEFT JOIN) CUSTOMER & OFFICER
SELECT CUS.CUST_ID,
		CUS.CITY,
        OFF.CUST_ID AS OFFICER_OF_CUST_ID,
		OFF.LAST_NAME
FROM CUSTOMER CUS
-- FROM OFFICER OFF
LEFT JOIN OFFICER OFF
-- RIGHT JOIN CUSTOMER CUS
ON CUS.CUST_ID = OFF.CUST_ID;

SELECT CUST_ID FROM CUSTOMER WHERE CUST_TYPE_CD = 'B';

SELECT ACCOUNT_ID, CUST_ID, AVAIL_BALANCE
FROM ACCOUNT




