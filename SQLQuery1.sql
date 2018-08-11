create table signUP(
userid int IDENTITY(100,1) PRIMARY KEY,
Name varchar(30) not null,
Phone varchar(20) not null,
Address varchar(40) not null,
Pin varchar(20) not null,
Balance float
)