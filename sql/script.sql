DROP TABLE IF EXISTS `user`;

CREATE TABLE `test`.`user` (
  `id`          INT(8)      NOT NULL AUTO_INCREMENT,
  `name`        VARCHAR(25) NOT NULL,
  `age`         INT(3)      NOT NULL,
  `isAdmin`     BIT(1)      NOT NULL DEFAULT b'0',
  `createdDate` DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);

INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Vastya', 22, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Vastya', 22, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Vastya', 22, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Petya', 23, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('Grisha', 42, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 1);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 0);
INSERT INTO `test`.`user` (`name`, `age`, `isAdmin`) VALUES ('abc', 47, 1);

