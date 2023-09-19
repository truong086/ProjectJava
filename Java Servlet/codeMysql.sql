create database QuanLyQuanTraSua;

use QuanLyQuanTraSua;
select * from product
create table categry(
	id int primary key auto_increment,
    tenloai nvarchar(50),
    ngaytao date
);

insert into categry(tenloai, ngaytao) values ('Trà sữa', '2022-10-10');

create table product(
	id int primary key auto_increment,
    title nvarchar(50),
    name nvarchar(50),
    image nvarchar(500),
    price double,  
    description nvarchar(500),
    catID int,
    foreign key (catID) references categry(id)
);
alter table product
add soluong int
add foreign key (account_ID) references `account`(id)
add account_ID int
update product set image = 'Logo-ngang-01.png' where id = 1;
insert into product(title, name, image, price, description, catID, sell_ID, account_ID, soluong) values ('Trà Sữa', 'Sữa', 'https://tocotocotea.com/wp-content/uploads/2021/04/Logo-ngang-01.png', 200000, 'Tuyệt vời', 1, 1, 1, 5);
select * from product
create table `account`( 
	id int primary key auto_increment,
	username nvarchar(50),
    `password` nvarchar(50),
    isSell int,
    isAdmin int
);

create table oder(
	id int primary key auto_increment,
    createDate date,
    customer_id int,
    foreign key(customer_id) references account(id),
    tongtien int
);

create table orderline(
	oder_id int,
    product_id int,
    foreign key (oder_id) references oder(id),
    foreign key (product_id) references product(id),
    quantity int,
    price float
);
select * from account 
select * from oder
select * from orderline;
select *, count(product_id) from orderline inner join product on orderline.product_id = product.id group by product_id having count(product_id) > 0 order by count(product_id) desc limit 6
select * from account
select * from orderline
select * from product order by id desc limit 6


select * from account where username = 'abc' and password = '123'
insert into account (username, password, isSell, isAdmin) values ('abc', '123', 1, 1);
select count(id) from product having count(id) >= 1
select * from product
update product set sell_ID = 1 where id = 1
alter table product
add foreign key (sell_ID) references `account`(id)
add sell_ID int
update `account` set isSell = 1 where id = 2
select * from `account`