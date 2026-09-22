CREATE DATABASE college;
CREATE DATABASE shop;

USE college;

CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50)
);

INSERT INTO student VALUES
(1, 'Akshit', 'CSE'),
(2, 'Atharva', 'CSE'),
(3, 'Agam', 'CSE');

USE shop;

CREATE TABLE product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    quantity INT,
    price DOUBLE
);

INSERT INTO product VALUES
(101, 'Pizza', 15, 250),
(102, 'Burger', 25, 120),
(103, 'Pasta', 12, 180);