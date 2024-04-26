CREATE TABLE t_table (
    id int not null AUTO_INCREMENT PRIMARY KEY,
    order_number varchar(255) default null,
    sku_code varchar(255),
    price decimal(10,2),
    quantity int(11)
);