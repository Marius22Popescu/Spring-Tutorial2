DROP TABLE IF EXISTS emp;

CREATE TABLE emp  (
    eno BIGINT auto_increment NOT NULL PRIMARY KEY,
    ename VARCHAR(40),
    esal numeric(10)
);