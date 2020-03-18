
drop database allmarket;

create database allmarket;

use allmarket;

create table items(
	item_id varchar(10) primary key not null,
	description varchar(300) not null,
	mark varchar(100) not null,
	department_id not null
	foreign_key
);


--- 
--- 100000*, 1000*, 10*, 1*
--- first 100 00 00 -> electronics
--- first 101 00 00 -> celulares y accessorios
--- first 101 01 00 -> celulares
--- first 101 01 00 -> 
create table departments(
	department_id primary key not null,
	description varchar(200) not null,
);




