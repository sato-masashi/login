set names utf8;
set foreign_key_checks = 0;

/*もし[logindb_sato]というDBが存在していたら削除する*/
drop database if exists logindb_sato;

/*DBの作成*/
create database logindb_sato;
use logindb_sato;

/*【user】テーブルの[カラム名] [値の型]を設定*/
create table user(
	id int,
	user_name varchar(255),
	password varchar(255)
);

/*【user】テーブルにデータを追加*/
insert into user values
(1,"taro","123"),
(2,"jiro","123"),
(3,"hanako","123"),
(4,"saburo","123");