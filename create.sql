create sequence seq_musteri start with 1 increment by 50;
create table musteri (id bigint not null, musteri_kod varchar(10), telefon varchar(15), il varchar(50), ilce varchar(100), musteri_adi varchar(200), adres varchar(500), primary key (id));
create sequence seq_musteri start with 1 increment by 50;
create table musteri (id bigint not null, musteri_kod varchar(10), telefon varchar(15), il varchar(50), ilce varchar(100), musteri_adi varchar(200), adres varchar(500), primary key (id));
create sequence seq_musteri start with 1 increment by 50;
create table fatura (ay integer, tutar numeric(38,2), yil integer, id bigint not null, musteri_fatura_id bigint, primary key (id));
create table musteri (id bigint not null, musteri_kod varchar(10), telefon varchar(15), il varchar(50), ilce varchar(100), musteri_adi varchar(200), adres varchar(500), primary key (id));
alter table if exists fatura add constraint FKp3spy0fml2bydkpynqyo984ho foreign key (musteri_fatura_id) references musteri;
