create table Person(
    id int8 PRIMARY KEY,
    firstname varchar(128),
    lastname varchar(128),
    city varchar(128) ,
    phone varchar(128),
    telegram varchar(128)
);

INSERT into Person(id,firstname,lastname,city,phone,telegram)
VALUES
(1,'Bex','Zhex','Astana','77777777','bex23'),
(2,'Asan','Tor','Shymkent','77777777','Asan@ata'),
(3,'Odin','Bara','Almaty','78882552','odin@aaa'),
(4,'Lom','Tara','Astana','788882525','lom@24')