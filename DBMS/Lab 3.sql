CREATE TABLE CRICKET(
	
	NAME VARCHAR(50),
	CITY VARCHAR(50),
	AGE INT



);

INSERT INTO CRICKET VALUES('Sachin Tendulkar','MUMBAI',30),('Rahul Dravid','Bombay',35),('M. S. Dhoni','Jharkhand',31),('Suresh Raina','GUJARAT',30)

select *into worldcup from CRICKET
select NAME,CITY INTO T20 FROM CRICKET
SELECT * INTO IPL FROM CRICKET

CREATE TABLE EMPLOYEE(

NAME VARCHAR(50),
CITY VARCHAR(50),
AGE INT
);
INSERT INTO EMPLOYEE VALUES('JAY PATEL','RAJKOT',30),('RAHUL DAVE','BARODA',35),('JEET PATEL','SURAT',31)
SELECT *INTO EMPLOYEE_DETAILS FROM EMPLOYEE
SELECT NAME,CITY INTO EMPLOYEE_DATA FROM EMPLOYEE
SELECT *INTO EMPLOYEE_INFO FROM EMPLOYEE
WHERE 1=0



UPDATE DEPOSIT
SET AMOUNT=5000
WHERE AMOUNT=3000

UPDATE BORROW
SET BNAME='C.G.ROAD'
WHERE BNAME='VRCE'

UPDATE DEPOSIT
SET ACTNO=111,AMOUNT=5000
WHERE CNAME='SANDIP'


UPDATE DEPOSIT
SET AMOUNT=7000
WHERE CNAME='KRANTI'

UPDATE BRANCH
SET BNAME='ANDHERI WEST'
WHERE BNAME='ANDHERI'

UPDATE DEPOSIT
SET BNAME='NEHRU PALACE'
WHERE CNAME='MEHUL'


UPDATE DEPOSIT
SET AMOUNT=5000
WHERE ACTNO BETWEEN 103 AND 107

UPDATE DEPOSIT
SET ADATE=95-4-1
WHERE CNAME='ANIL'


UPDATE DEPOSIT
SET AMOUNT=10000
WHERE CNAME='MINU'


UPDATE DEPOSIT
SET ADATE=96-4-1,AMOUNT=5000
WHERE CNAME='SANDIP'

UPDATE BORROW
SET LOANNO=LOANNO+LOANNO*0.1 

UPDATE DEPOSIT
SET AMOUNT=AMOUNT+AMOUNT*0.2


UPDATE BORROW
SET AMOUNT= NULL
WHERE LOANNO=321

UPDATE BORROW
SET BNAME=NULL
WHERE CNAME='KRANTI'

SELECT CNAME FROM BORROW
WHERE LOANNO IS NULL

SELECT CNAME FROM BORROW
WHERE BNAME IS NOT NULL

UPDATE BORROW
SET AMOUNT=5000,BNAME='VRCE',CNAME='DARSHAN'
WHERE LOANNO=581


SELECT *FROM BORROW
WHERE CNAME='KRANTI'


UPDATE DEPOSIT
SET ADATE=2021-01-01
WHERE AMOUNT<2000

UPDATE DEPOSIT
SET ADATE=NULL,BNAME='ANDHERI'
WHERE ACTNO=110

