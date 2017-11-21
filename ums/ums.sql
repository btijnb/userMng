create database ums character set utf8 collate utf8_general_ci;

use ums;

create table t_user(
	user_id varchar(20) not null primary key, /*MEMO variable length QUESTION 20*/
    name varchar(20) not null,
    birth varchar(20) not null,
    address varchar(20) not null,
    pn varchar(20) not null,
    pw varchar(20) not null,
    status varchar(20) not null,
    updated varchar(20) not null
);

insert into t_user values('0001', 'apple', '1991/1/1', '東京都', '031112322', '1234', 'ACTV', '6/2/17 14:29');

