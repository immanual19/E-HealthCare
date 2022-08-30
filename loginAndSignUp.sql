create database db;
use db;


create table patients(

name varchar(100) not null,
email_id varchar(100) not null unique,
password varchar(100) not null,
mobile_no varchar(20) not null,
primary key(email_id)
)

create table doctors(

name varchar(100) not null,
email_id varchar(100) not null unique,
password varchar(100) not null,
mobile_no varchar(20) not null,
primary key(email_id)
)

create table pharmacists(

name varchar(100) not null,
email_id varchar(100) not null unique,
password varchar(100) not null,
mobile_no varchar(20) not null,
primary key(email_id)
)
use db;
select * from patients;
select * from doctors;
select * from pharmacists;