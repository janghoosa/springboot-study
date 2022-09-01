show databases;

use test;

show variables like 'c%'; # 캐릭터셋 확인
select @@time_zone, now(); # 타임존 확인

CREATE TABLE test (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    content varchar(255) DEFAULT NULL,
    PRIMARY KEY (id)
);

INSERT INTO test(content) values ('테스트');

SELECT * FROM test;