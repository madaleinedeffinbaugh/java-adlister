-- Adminer 4.8.1 MySQL 5.5.5-10.6.12-MariaDB-0ubuntu0.22.04.1 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `ads`;
CREATE TABLE `ads` (
                       `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
                       `user_id` int(10) unsigned NOT NULL,
                       `title` varchar(1024) NOT NULL,
                       `description` mediumtext NOT NULL,
                       PRIMARY KEY (`id`),
                       KEY `user_id` (`user_id`),
  CONSTRAINT `ads_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


DROP TABLE IF EXISTS `ads_categories`;
CREATE TABLE `ads_categories` (
                                  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
                                  `ad_id` int(10) unsigned NOT NULL,
                                  `category_id` int(10) unsigned NOT NULL,
                                  PRIMARY KEY (`id`),
                                  KEY `ad_id` (`ad_id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `ads_categories_ibfk_1` FOREIGN KEY (`ad_id`) REFERENCES `ads` (`id`),
  CONSTRAINT `ads_categories_ibfk_2` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
                         `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
                         `username` varchar(100) NOT NULL,
                         `email` varchar(100) NOT NULL,
                         `password` varchar(100) NOT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES
    (1,	'mdeffinbaugh',	'madaleine.deffinbaugh@gmail.com',	'securePassword');

-- 2023-06-25 03:51:09