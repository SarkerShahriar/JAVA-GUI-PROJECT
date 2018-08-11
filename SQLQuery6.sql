create table withdraw(
userid int foreign key references signUP,
withdrawid int IDENTITY(1,1) primary key,
Amount float not null,
)