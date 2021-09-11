create table `appr2s`.vaitro(
	id varchar(10) not null primary key,
    vaitro nvarchar(20) not null
);

insert into `appr2s`.vaitro values("ad","Admin");

create table `appr2s`.taikhoan(
	tendn varchar(10) not null primary key,
    matkhau varchar(20) not null,
    hoten nvarchar(50) not null,
    email nvarchar(50) not null,
    vaitro_id varchar(10) not null,
    foreign key (vaitro_id) references vaitro(id)
);
insert into `appr2s`.taikhoan values ("phuong","123","phuong tran","phuong@gmail.com","ad");

create table `appr2s`.chucvu(
	id varchar(10) not null primary key,
    chucvu nvarchar(50) not null
);


create table `appr2s`.cty (
	id varchar(10) not null primary key,
    tencty nvarchar(100) not null
);

create table `appr2s`.qly (
	id int not null primary key auto_increment,
    taikhoan_id varchar(10) not null,
    chucvu_id varchar(10) not null,
    cty_id varchar(10) not null,
    foreign key (taikhoan_id)  REFERENCES taikhoan(tendn),
    foreign key (chucvu_id) references chucvu(id),
    foreign key (cty_id) references cty(id)
);