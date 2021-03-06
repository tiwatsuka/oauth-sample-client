/* define the schemas. */
create table if not exists users (
	username varchar_ignorecase(50) not null primary key,
	password varchar_ignorecase(60) not null,
	enabled boolean not null
);

create table if not exists authorities (
	username varchar_ignorecase(50) not null,
	authority varchar_ignorecase(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);
