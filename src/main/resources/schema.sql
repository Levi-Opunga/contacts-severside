create table Contact
(
    id         int auto_increment primary key,
    first_name varchar(100),
    last_name  varchar(100) not null,
    email      varchar(100) not null,
    phone      varchar(100) not null,
    mobile     varchar(100) not null,
    website    varchar(100) not null,
    linked_in   varchar(100) not null,
    facebook   varchar(100) not null

);

create table User
(
    id       int auto_increment primary key,
    name     varchar(100),
    password varchar(100) not null,
    admin TINYINT
)