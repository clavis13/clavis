-- SQL(구조화 질의 언어)
-- MySQL DBMS(RDBMS) 관계형데이터베이스 - TABLE 단위로 저장
create database bigdata;
-- var(~) 가변형
create table student(
	num int not null primary key auto_increment,
    name varchar(50),
	tel varchar(50),
	age int,
    email varchar(50)
);
-- CRUD
insert instudentto student(name,tel,age,email)
values('박준범','010-5109-7897',31,'clavis13@naver.com');
insert into student(name,tel,age,email)
values('아무개','010-1234-5678',20,'111111111@naver.com');
select * from student;
update student set age=99 where num=2;
update student set email= 'sadasd@naver.com' , tel= '010-5151-0505' where num=2;
delete from student where num=2;
drop table student;



