USE `plusmed_db`;

-- dummy data
-- Doc

insert into doctors (AVATAR_PATH, BIRTH_DATE  ,DESCRIPTION ,EMAIL ,NAME ,PASSWORD ,PESEL ,PHONE ,SPECIALIZATION ,SURNAME ) values('kowalski.jpg', '1984-02-13', 'descr', 'mail2', 'Krzysztof', 'pass', 'pesel','654987123','Internista', 'Kowalski');
insert into doctors (AVATAR_PATH, BIRTH_DATE  ,DESCRIPTION ,EMAIL ,NAME ,PASSWORD ,PESEL ,PHONE ,SPECIALIZATION ,SURNAME ) values('nowak.jpg', '1985-05-01', 'descr', 'mail3', 'Adam', 'pass', 'pesel','123456789','Internista', 'Nowak');
insert into doctors (AVATAR_PATH, BIRTH_DATE  ,DESCRIPTION ,EMAIL ,NAME ,PASSWORD ,PESEL ,PHONE ,SPECIALIZATION ,SURNAME ) values('michalik.jpg', '1970-11-23', 'descr', 'mail4', 'Jadwiga', 'pass', 'pesel','645879213','Neurolog', 'Michalik');

-- User

insert into users (address, avatar_path, birth_date, chronic_diseases, email, gender, name, password,pesel, phone, surname) values('Sienkiewicza 63/14 Łódź 94-212', 'avatar path','2001-01-11', 'Alergia', 'mail1', 'm', 'Arkadiusz', 'pass', 'pesel', '600125974', 'Sikorski');
insert into users (address, avatar_path, birth_date, chronic_diseases, email, gender, name, password,pesel, phone, surname) values('Łódzka 12 Tuszyn 95-080', 'avatar path','1998-04-07', 'brak', 'mail2', 'k', 'Aleksandra', 'pass', 'pesel', '798459781', 'Czerwińska');
insert into users (address, avatar_path, birth_date, chronic_diseases, email, gender, name, password,pesel, phone, surname) values('Wschodnia 24/10 Zgierz 92-021', 'avatar path','2001-08-30', ' Astma', 'mail3', 'm', 'Marcel', 'pass', 'pesel', '500149988', 'Wróblewski');
insert into users (address, avatar_path, birth_date, chronic_diseases, email, gender, name, password,pesel, phone, surname) values('Bandurskiego 33/14 Łódź 94-045', 'avatar path','1994-12-30', ' Padaczka', 'mail4', 'k', 'Lidia', 'pass', 'pesel', '658978145', 'Kucharska');

-- Appointments

insert into appointments (date_Time, diagnosis, price, recommendations,type, user_Id,doctor_Id) values('2000-08-11 10:15:00' , 'diagnosis' , 100 , 'recommendation' , 15 , 1 , 1);
insert into appointments (date_Time, diagnosis, price, recommendations,type, user_Id,doctor_Id) values('2000-08-11 10:30:00' , 'diagnosis2' , 100 , 'recommendation2' , 15 , 2 , 1);
insert into appointments (date_Time, diagnosis, price, recommendations,type, user_Id,doctor_Id) values('2000-08-12 11:00:00' , 'diagnosis' , 100 , 'recommendation' , 15 , 3 , 1);
insert into appointments (date_Time, diagnosis, price, recommendations,type, user_Id,doctor_Id) values('2000-08-12 11:15:00' , 'diagnosis2' , 100 , 'recommendation2' , 15 , 4 , 1);
insert into appointments (date_Time, diagnosis, price, recommendations,type, user_Id,doctor_Id) values('2000-08-18 09:00:00' , 'diagnosis' , 100 , 'recommendation' , 30 , 1 , 2);
insert into appointments (date_Time, diagnosis, price, recommendations,type, user_Id,doctor_Id) values('2000-08-18 09:30:00' , 'diagnosis2' , 100 , 'recommendation2' , 30 , 2 , 2);
insert into appointments (date_Time, diagnosis, price, recommendations,type, user_Id,doctor_Id) values('2000-08-19 10:00:00' , 'diagnosis' , 100 , 'recommendation' , 30 , 3 , 2);
insert into appointments (date_Time, diagnosis, price, recommendations,type, user_Id,doctor_Id) values('2000-08-19 10:30:00' , 'diagnosis2' , 100 , 'recommendation2' , 30 , 4 , 2);

-- Prescription

insert into prescription (content, appointment_id)  values('Aponapro 2x na dobe po 1 tabletce, dużo odpoczynku' , 5);
insert into prescription (content, appointment_id)  values( 'Paracetamol przy występowaniu gorączki, Scorbolamid 2x3' , 6);
insert into prescription (content, appointment_id)  values('brak' , 7);
insert into prescription (content, appointment_id)  values( 'brak' , 8);
