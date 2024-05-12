/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : localhost:3306
 Source Schema         : jdbc

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 12/05/2024 20:33:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for info
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO `info` VALUES (1, '今晚准备吃什么');
INSERT INTO `info` VALUES (2, 'what is your name');
INSERT INTO `info` VALUES (3, 'Are you sure?');
INSERT INTO `info` VALUES (4, '我不理解');

SET FOREIGN_KEY_CHECKS = 1;



-- CREATE TABLE INFO(
--                      id INT(3) PRIMARY KEY AUTO_INCREMENT,
--                      TITLE VARCHAR(40) NOT NULL
-- );
--
-- INSERT INTO INFO(TITLE) VALUES ('今晚准备吃什么');
-- INSERT INTO INFO(TITLE) VALUES ('what is your name');
-- INSERT INTO INFO(TITLE) VALUES ('Are you sure?');
-- INSERT INTO INFO(TITLE) VALUES ('我不理解');
