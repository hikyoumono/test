set names utf8;
set foreign_key_checks = 0;
drop database if exists ecsite;
create database if not exists ecsite;
use ecsite;

drop table if exists login;
create table login(
id int not null primary key auto_increment,
login_id varchar(50) unique,
login_pass varchar(50),
user_name varchar(50),
insert_date datetime,
update_date datetime
);

drop table if exists itemlist;
create table itemlist(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

drop table if exists buy_item;
create table buy_item(
id int not null primary key auto_increment,
item_id int,
total_price int,
total_count int,
user_id varchar(50),
pay varchar(50),
insert_date datetime,
delete_date datetime
);

INSERT INTO itemlist(item_name, item_price, item_stock) VALUES("ÉmÅ[ÉgBook", 100,
50);