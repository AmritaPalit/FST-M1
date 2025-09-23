-- Create a table named orders
create table orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);

-- Add values to the table
INSERT ALL
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)

Activity 6

SELECT 1 FROM DUAL;

-- Get all salesman ids without any repeated values
select distinct salesman_id from orders;

-- Display the order number ordered by date in ascending order
select order_no, order_date from orders order by order_date;

-- Display the order number ordered by purchase amount in descending order
select order_no, purchase_amount from orders order by purchase_amount DESC;

-- Display the full data of orders that have purchase amount less than 500.
select * from orders where purchase_amount < 500;

-- Display the full data of orders that have purchase amount between 1000 and 2000.
select * from orders where purchase_amount between 1000 and 2000;

---------------Activity 7----------------------

--Write an SQL statement to find the total purchase amount of all orders.
select SUM(purchase_amount) as sum from orders 
--Write an SQL statement to find the average purchase amount of all orders.
select AVG(purchase_amount) as avg from orders 
--Write an SQL statement to get the maximum purchase amount of all the orders.
select MAX(purchase_amount) as max from orders 
--Write an SQL statement to get the minimum purchase amount of all the orders.
select MIN(purchase_amount) as min from orders
--Write an SQL statement to find the number of salesmen listed in the table.
select COUNT(distinct salesman_id) as count from orders

-----------------Activity 8-----------------------------
--Write an SQL statement to find the highest purchase amount ordered by the each customer with their ID and highest purchase amount.
select customer__ID,max(purchase_amount) as max from order group by customer_id order by customer_id
--Write an SQL statement to find the highest purchase amount on '2012-08-17' for each salesman with their ID.
select salesman_id,order_date,max(purchase_amount) as max from orders 
where order_date = TO_DATE('2012/08/17','YYYY/MM/DD') GROuP BY salesman_id,order_date;

--Write an SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list [2030, 3450, 5760, 6000].
select customer_id,MAX(purchase_amount) as max from orders Group by customer_id having MAX(purchase_amount) in (2030, 3450, 5760, 6000);

---------------Activity 6-11---------------------------
CREATE TABLE salesman (
    salesman_id int PRIMARY KEY,
    salesman_name varchar2(32),
    salesman_city varchar2(32),
    commission int
);

--Activity 2
INSERT INTO salesman(salesman_id,salesman_name,salesman_city,commission)
--VALUES (5001,'James Hoog','New York',15);
INSERT INTO salesman(salesman_id,salesman_name,salesman_city,commission)
    VALUES(5002,'Nail Knite','Paris',13)
INSERT INTO salesman(salesman_id,salesman_name,salesman_city,commission)
    VALUES(5005,'Pit Alex','London',11)
INSERT INTO salesman(salesman_id,salesman_name,salesman_city,commission)
    VALUES(5006,'McLyon','Paris',14)
INSERT INTO salesman(salesman_id,salesman_name,salesman_city,commission)
    VALUES (5007,'Paul Adam','Rome',13)
INSERT INTO salesman(salesman_id,salesman_name,salesman_city,commission)
    VALUES (5003,'Lauson Hen','San Jose',12);

INSERT All
    INTO salesman VALUES(5001,'James Hoog','New York',15)
    INTO salesman VALUES(5002,'Nail Knite','Paris',13)
    INTO salesman VALUES(5003,'Lauson Hen','San Jose',12)
    INTO salesman VALUES(5005,'Pit Alex','London',11)
    INTO salesman VALUES(5006,'McLyon','Paris',14)
    INTO salesman VALUES(5007,'Paul Adam','Rome',13)
    SELECT 1 FROM DUAL;

select * from orders;

-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

-- Insert values into it
INSERT ALL
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;

select * from salesman;
select * from customers;
select * from orders;

-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

-- Insert values into it
INSERT ALL
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;
-----------Activity9----------------
--Write an SQL statement to know which salesman are working for which customer.
select customer_id,salesman_id from salesman s inner join customers c on s.salesman_id=c.salesman_id;

--Write an SQL statement to make a list of customers in ascending order with a salesman that have a grade less than 300.
select c.customer_name,s.salesman_name,c.grade from customers c inner join salesman s on c.salesman_id=s.salesman_id where c.grade < 300 order by s.SALESMAN_NAME asc

    
--Write an SQL statement to find the list of customers who appointed a salesman who gets a commission of more than 12%.
select c.customer_name,s.salesman_name,s.commission from customers c inner join salesman s 
    on c.salesman_id=s.salesman_id where s.commission > 12 --order by s.SALESMAN_NAME asc

--Write an SQL statement to find the following details of an order - order number, order date, purchase amount of order,
  --  which customer gives the order and which salesman works for that customer and commission rate they get for the order.

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.salesman_name AS "Salesman", c.commission FROM orders a 
INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;


----------------Activity 10-------------------------

--Write a query to find all the orders issued against the salesman who may works for customer whose id is 3007.
select * from orders where salesman_id in 
    (select s.salesman_id from customers c INNER JOIN salesman s ON c.salesman_id=s.salesman_id where c.customer_id=3007)
--Write a query to find all orders attributed to a salesman in New York.
select o.order_no,o.purchase_amount,o.order_date from orders o INNER JOIN salesman s ON o.salesman_id=s.salesman_id where s.salesman_city = 'New York'

--Write a query to count the customers with grades above New York's average.
select count(distinct customer_id) from customers where grade > (select avg(grade) from customers where city = 'New York')

--Write a query to extract the data from the orders table for those salesman who earned the maximum commission
select o.order_no,o.purchase_amount,o.order_date from salesman s inner join orders o on o.salesman_id=s.salesman_id
where s.commission = MAX(commission)

---------------------------Activity 11-----------------------
--Write a query that produces the name and number of each salesman and each customer with more than one current order.
--Put the results in alphabetical order.
SELECT customer_id, customer_name FROM customers a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id)
UNION
SELECT salesman_id, salesman_name FROM salesman a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id)
ORDER BY customer_name;

--Write a query to make a report of which salesman produce the largest and smallest orders on each date. Also add a column that shows "highest on" and "lowest on" values.
SELECT a.salesman_id, a.salesman_name, o.order_no, 'highest on', o.order_date, o.purchase_amount FROM salesman a, orders o
WHERE a.salesman_id=o.salesman_id
AND o.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = o.order_date)
UNION
SELECT a.salesman_id, a.salesman_name, o.order_no, 'lowest on', o.order_date, o.purchase_amount FROM salesman a, orders o
WHERE a.salesman_id=o.salesman_id
AND o.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = o.order_date)
ORDER BY order_date;
