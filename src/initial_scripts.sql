CREATE SCHEMA users;

USE users;

CREATE TABLE `users`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `age` INT NULL,
  `address_id` INT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `users`.`addresses` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `street` VARCHAR(45) NULL,
  `number` INT NULL,
  PRIMARY KEY (`id`));


INSERT INTO `users`.`addresses`
(
`street`,
`number`)
VALUES
(
"Lepant",
999);

INSERT INTO `users`.`addresses`
(
`street`,
`number`)
VALUES
(
"Gran Via",
111);

ALTER TABLE users
ADD FOREIGN KEY (address_id) REFERENCES addresses(id);

INSERT INTO `users`.`users`
(
`name`,
`age`,
`address_id`)
VALUES
(
"Fernando",
29,
1);

INSERT INTO `users`.`users`
(
`name`,
`age`,
`address_id`)
VALUES
(
"Gonzalo",
35,
2);
