use db;
show tables;

select * from appointedDoctor;
select * from patients;
select * from doctors;
select * from pharmacists;

create table test(
	id int,
    prescription blob
);

select * from OrderedMedicine;
alter table OrderedMedicine add column customerId int;
select * from OrderedMedicine where pharmacistId=2;

create table PrescriptionTable(

 tableID int auto_increment,
 patientID int,
 prescriptionLink varchar(255),
 primary key(tableID)

);
alter table test add column id int;
select * from test;
drop table test;
create table Medicine(

	id int auto_increment,
    pharmacistId int,
    medicinename varchar(255),
    unitprice float,
    medcount int,
    location varchar(255),
    primary key (id)
);

select * from Medicine;

alter table PrescriptionTable add column disease varchar(255);
alter table Medicine add column pharmacyname varchar(255);

drop table PrescriptionTable;

create table OrderedMedicine(
	id int auto_increment,
    pharmacistId int,
    customerName varchar(255),
    customerPhoneNumber varchar(255),
    customerAddress varchar(255),
    medicineName varchar(255),
    unitOrdered int,
    primary key (id)
);

select * from OrderedMedicine;

select * from PrescriptionTable where patientID=2;

select patientID, pname, mobileno, address, disease from appointedDoctor ap join patients p on ap.patientID = p.pid;

use db;
create table pop(
nid varchar(20),
name varchar(20)
);

create table birth(
nid varchar(20),
name varchar(20)
);

alter table OrderedMedicine add deliveryTime varchar(255);