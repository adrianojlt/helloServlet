use helloservlet;

DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    emp_id          INT(11)         NOT NULL    AUTO_INCREMENT,
    emp_name        varchar(255)    NOT NULL,
    salary          double        	NOT NULL,
    dept_name       varchar(255)    NOT NULL,        
    PRIMARY KEY(emp_id)
);

select * from employee;

INSERT INTO employee (emp_name,salary,dept_name) VALUES 
    ('john',	10000,        'development'),
    ('peter',	14000,        'development'),
    ('north',	12000,        'development'),
    ('mary',	40000,        'development'),
    ('asdf',	1000,         'development'),
    ('jai',		140000,        'development'),
    ('andres',	140000,        'development'),
    ('andres',	140000,        'development');

