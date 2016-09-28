/*
Navicat MySQL Data Transfer

Source Server         : Lancebd
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : fms

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-09-28 08:40:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for s_user
-- ----------------------------
DROP TABLE IF EXISTS `s_user`;
CREATE TABLE `s_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_birthday` varchar(255) DEFAULT NULL,
  `user_salary` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_user
-- ----------------------------
INSERT INTO `s_user` VALUES ('1', 'tom', '2016-09-24 17:38:08', '1234.00');
INSERT INTO `s_user` VALUES ('2', 'Tom', '2016-09-24 18:32:57.169', '2000.00');
INSERT INTO `s_user` VALUES ('3', 'Tom', '2016-09-24 18:33:07.748', '2000.00');
INSERT INTO `s_user` VALUES ('4', 'Tom', '2016-09-24 18:36:22.126', '2000.00');
INSERT INTO `s_user` VALUES ('5', 'Lancebd', '2016-09-25 21:14:08.524', '20000.20');
INSERT INTO `s_user` VALUES ('6', 'Lancebd', '2016-09-25 21:14:35.877', '20000.20');

-- ----------------------------
-- Table structure for testm
-- ----------------------------
DROP TABLE IF EXISTS `testm`;
CREATE TABLE `testm` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `age` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testm
-- ----------------------------
INSERT INTO `testm` VALUES ('1', 'Chikit', '21');
