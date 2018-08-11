create table deposit(
userid int foreign key references signUP,
dipositeid int IDENTITY(1,1) primary key,
Amount float not null,
)