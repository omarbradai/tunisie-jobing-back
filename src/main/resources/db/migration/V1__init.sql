create table jobeur_profile
(
  id bigint(20) not null auto_increment,
  description varchar(20),
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table recruiter_profile
(
  id bigint(20) not null auto_increment,
  description varchar(20),
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table user
(
  id bigint(20) not null AUTO_INCREMENT,
  name varchar(20),
  fullname varchar(20),
  age integer,
  description varchar(255),
  jobeur_profile_id bigint unique,
  recruiter_profile_id bigint unique,
  primary key (id),
  FOREIGN KEY (jobeur_profile_id) references jobeur_profile (id),
  FOREIGN KEY (recruiter_profile_id) references recruiter_profile (id)

)ENGINE=InnoDB DEFAULT CHARSET=utf8;;

CREATE TABLE category
(
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(20),
  description varchar(255),
  category_id bigint(20),
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;;

CREATE TABLE service
(
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(20),
  description varchar(255),
  category_id bigint(20),
  recruiter_profile_id bigint(20),
  PRIMARY KEY (id),
  foreign key (recruiter_profile_id) references service (id),
  FOREIGN KEY (category_id) references category (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;;

create table service_request
(
  id bigint(20) not null auto_increment,
  service_id bigint(20),
  jobeur_profile_id bigint(20),
  primary key (id),
  foreign key (service_id) references service (id),
  foreign key (jobeur_profile_id) references jobeur_profile (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;;

create table message
(
  id bigint(20) not null auto_increment,
  text varchar(255),
  service_request_id bigint(20),
  primary key (id),
  foreign key (service_request_id) references service_request(id)
)
