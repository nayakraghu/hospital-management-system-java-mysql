CREATE DATABASE IF NOT EXISTS hospital_db; USE hospital_db;
CREATE TABLE IF NOT EXISTS users(id INT AUTO_INCREMENT PRIMARY KEY,username VARCHAR(50),password VARCHAR(50));
INSERT INTO users(username,password) VALUES('admin','admin123');
CREATE TABLE IF NOT EXISTS patients(id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(100),email VARCHAR(100),disease VARCHAR(100),doctor VARCHAR(100),fees DOUBLE,admit_date DATE);
INSERT INTO patients(name,email,disease,doctor,fees,admit_date) VALUES('Amit Shah','amit@gmail.com','Diabetes','Dr. Mehta',5000,'2024-01-10'),('Riya Patel','riya@gmail.com','Fever','Dr. Singh',1500,'2024-02-15'),('Suresh Kumar','suresh@gmail.com','Fracture','Dr. Mehta',8000,'2024-03-01'),('Neha Joshi','neha@gmail.com','Malaria','Dr. Rao',3000,'2024-04-20');
