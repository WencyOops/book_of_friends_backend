create table users
(
    id              bigint primary key auto_increment,
    username        varchar(20) unique not null,
    birthday        date,
    favorite_food   varchar(20),
    favorite_animal varchar(20),
    comment         varchar(100)
);

insert into `users`(`id`, `username`, `birthday`, `favorite_food`, `favorite_animal`, `comment`)
values ('1',
        'Wency',
        date('2022-05-09'),
        'watermelon',
        'dog',
        'Oops~'),
       ('2',
        'Ailsa',
        date('1995-10-17'),
        'bamboo',
        'panda',
        'Megami');


