drop database trackerGastosDb;
drop user trackerGastos;
create user trackerGastos with password "password";
create database trackerGastos with template=template0 owner=trackerGastos;
\connect trackerGastosDb;
alter default privileges grant all on tables to trackerGastos;
alter default privileges grant all on sequences to trackerGastos;

create table tg_users(
user_id integer primary key not null,
first_name varchar(20) not null,
last_name varchar(20) not null,
email varchar(30) not null,
password text not null
);

create table tg_categories(
category_id integer primary key not null,
user_id integer not null,
title varchar(20) not null,
description varchar(50) not null
);
alter table tg_categories add constraint cat_users_fk
foreign key (user_id) references tg_users(user_id);

create table tg_transactions(
transactions_id integer primary key not null,
category_id integer not null,
user_id integer not null,
amount numeric(10,2) not null,
note varchar(50) not null,
transaction_date bigint not null
);
alter table tg_transactions add constraint trans_cat_fk
foreign key (category_id) references tg_categories(category_id);
alter table tg_transactions add constraint trans_users_fk
foreign key (user_id) references tg_users(user_id);

create sequence tg_users_seq increment 1 start 1;
create sequence tg_categories_seq increment 1 start 1;
create sequence tg_transactions_seq increment 1 start 1000;