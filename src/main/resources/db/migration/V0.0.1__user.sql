create table users
(
	id serial not null primary key,
	first_name varchar(255) not null,
	last_name varchar(255) not null
);

insert into users (id, first_name, last_name)
VALUES (1, 'morten', 'stulen')