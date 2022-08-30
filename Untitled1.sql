use db;

select * from patients;

select * from doctors;

select * from pharmacists;

alter table patients drop column location;

insert into doctors(dname,speciality,emailid,pwd,mobileno,location) values("Imman","General"
"immanual65@gmail.com","12345","01708625386","Dhaka");

alter table doctors add column fees int;
insert into patients (address) value ("29th Agargaon, Sher-e-Bangla Nagar, Dhaka 1207") where pid=1;
create table prescriptions(

	pid int,
    did int,
);

alter table patients add column address varchar(255);

create table address(

address varchar(255),
primary key(address)

);
select * from prescriptions;
insert into address value("29th Agargaon, Sher-e-Bangla Nagar, Dhaka 1207");
select * from address;