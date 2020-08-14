--dummy data
insert into doctors (AVATAR_PATH, BIRTH_DATE  ,DESCRIPTION ,EMAIL ,NAME ,PASSWORD ,PESEL ,PHONE ,SPECIALIZATION ,SURNAME )
values('dehh', '2000-01-11', 'descr', 'mail2', 'name', 'pass', 'pesel','phone','spec', 'surname');
insert into users (address, avatar_path, birth_date, chronic_diseases, email, gender, name, password,pesel, phone, surname)
 values('address', 'avatar path','2000-01-11', ' chronic disease', 'mail', 'm', 'name', 'pass', 'pesel', 'phone', 'surname');
--
insert into appointments (date_Time, diagnosis, price, recommendations,type, user_Id,doctor_Id)
values('2000-01-11 10:00:00' , 'diagnosis' , 100 , 'recommendation' , 15 , 1 , 1);
insert into appointments (date_Time, diagnosis, price, recommendations,type, user_Id,doctor_Id)
values('2000-01-12 10:00:00' , 'diagnosis2' , 100 , 'recommendation2' , 15 , 1 , 1);
--
insert into prescription (content, appointment_id)  values('content' , 1);
insert into prescription (content, appointment_id)  values( 'content2' , 2);
--