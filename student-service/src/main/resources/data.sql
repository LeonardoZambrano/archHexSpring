DROP TABLE IF EXISTS tbl_students;
CREATE TABLE tbl_students (
  id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  age BIGINT,
  address VARCHAR(250) NOT NULL
);
INSERT INTO tbl_students (first_name, last_name, age, address)
VALUES ('Omar Leonardo','Zambrano Pulgarin',31,'Cll 10 No 80-41');