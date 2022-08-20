DROP TABLE IF EXISTS `tenant`;

-- campaigns table
CREATE TABLE `tenant` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(200) NULL DEFAULT NULL,
    `description` VARCHAR(200) NULL DEFAULT NULL,
    `regdate` DATETIME NULL DEFAULT NULL,
    `update` DATETIME NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);
