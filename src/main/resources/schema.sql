DROP TABLE if EXISTS book_info;
DROP TABLE IF EXISTS users;

CREATE TABLE book_info
(book_id INT PRIMARY KEY AUTO_INCREMENT
,book_code VARCHAR(50)
,book_name VARCHAR(50)
,book_type INT(2)
,book_author VARCHAR(20)
,publish_press VARCHAR(200)
,public_date DATE
,is_borrow INT(2)
,cretedBy VARCHAR(50)
,creation_time DATE
,last_updatetime DATE
);

CREATE TABLE users
(user_id INT PRIMARY KEY AUTO_INCREMENT
,user_code VARCHAR(10)
,password VARCHAR(60)
,email VARCHAR(50)
,gender VARCHAR(7)
,register_time DATE
,last_logintime DATE
);

INSERT INTO users(user_code, password, email, gender, register_time, last_logintime)
VALUES('Tom', '$2a$10$4AuhT4uslH3to2AGgbB1POchw7QVN8j4lK60JXJEFmv4cT1OT7uzi', 'tom@google.com', '男', DATE'2018-01-01', DATE'2018-04-18');
/*password is 123456 */

INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000023', '企业应用架构模式', 8, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000024', '精通Hibernate', 8, '刘洋', '电子工业出版社', DATE'2015-12-17', 1, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000025', '天龙八部', 1, '金庸', '中原出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000026', '寻找家园', 4, '高尔泰', '北京十月文艺出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000027', '小猫莫格成长系列', 5, '(英)朱迪斯 克尔', '接力出版社', DATE'2015-12-17', 1, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000028', '第6本书', 2, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000029', '第7本书', 3, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 1, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000030', '第8本书', 4, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000031', '第9本书', 6, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000032', '第10本书', 7, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 1, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000033', '第11本书', 1, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000034', '第12本书', 2, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 1, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000023', '第13本书', 8, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000023', '第14本书', 8, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000023', '第15本书', 8, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000023', '第16本书', 8, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000023', '第17本书', 8, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000023', '第18本书', 8, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000023', '第19本书', 8, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000023', '第20本书', 8, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000023', '第21本书', 8, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');
INSERT INTO book_info(book_code, book_name, book_type, book_author, publish_press, public_date, is_borrow, cretedBy, creation_time, last_updatetime)
VALUES('BK000023', '第22本书', 8, '(英)Martin Fowler', '机械工业出版社', DATE'2015-12-17', 0, 'Tom', DATE'2018-01-02', DATE'2018-01-02');