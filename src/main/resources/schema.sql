--generated from jpa
create sequence hibernate_sequence start with 1 increment by 1
create table appointments (appointmentid bigint not null, date_time timestamp, diagnosis varchar(255), price integer, recommendations varchar(255), type integer, doctor_doctorid bigint, user_userid bigint, primary key (appointmentid))
create table attached_images (imageid bigint not null, description varchar(255), path varchar(255), appointment_appointmentid bigint, primary key (imageid))
create table doctors (doctorid bigint not null, avatar_path varchar(255), birth_date date, description varchar(255), email varchar(255), name varchar(255), password varchar(255), pesel varchar(255), phone varchar(255), specialization varchar(255), surname varchar(255), primary key (doctorid))
create table prescription (prescriptionid bigint not null, content varchar(255), appointment_appointmentid bigint, primary key (prescriptionid))
create table sick_leaves (leavesid bigint not null, end_date date, remarks varchar(255), start_date date, appointment_appointmentid bigint, primary key (leavesid))
create table users (userid bigint not null, address varchar(255), avatar_path varchar(255), birth_date date, chronic_diseases varchar(255), email varchar(255), gender varchar(255), name varchar(255), password varchar(255), pesel varchar(255), phone varchar(255), surname varchar(255), primary key (userid))
create table work_hours (day integer not null, doctorid bigint not null, end time, start time, primary key (day, doctorid))
alter table appointments add constraint FKrkfom7d38247woglihgd52xwb foreign key (doctor_doctorid) references doctors
alter table appointments add constraint FK82f5p3887lqhpr6xwv26x9gpx foreign key (user_userid) references users
alter table attached_images add constraint FKeoqb2y4wqiu449u2k28tyjnll foreign key (appointment_appointmentid) references appointments
alter table prescription add constraint FKfenw303s3d4mufxag21yyn32d foreign key (appointment_appointmentid) references appointments
alter table sick_leaves add constraint FKq6g3s6lprhfwdldp2jen5e22b foreign key (appointment_appointmentid) references appointments