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

 Date: 13/05/2024 12:36:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `cover` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `image1` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `image2` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `price` float NULL DEFAULT NULL,
  `intro` varchar(300) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `stock` int NULL DEFAULT NULL,
  `type_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_type_id_idx`(`type_id` ASC) USING BTREE,
  CONSTRAINT `fk_type_id` FOREIGN KEY (`type_id`) REFERENCES `type` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 181 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, 'iQOO 12 Pro 16GB+256GB 赛道版', '/picture/1715567793392.jpg', '/picture/1715567793394.jpg', '/picture/1715567793427.jpg', 4999, '第三代骁龙8移动平台|自研电竞芯片Q1|万里追光影像系统|2K E7 144Hz 全感屏|全时四区散热系统', 499, 1);
INSERT INTO `goods` VALUES (2, 'iQOO Neo9 Pro 16GB+512GB 格斗黑', '/picture/1715568017350.jpg', '/picture/1715568017353.jpg', '/picture/1715568017357.jpg', 3599, '天玑 9300 旗舰芯|自研电竞芯片 Q1|IMX920 索尼大底主摄|1.5K 144Hz 8T 全天候超感屏|6K 天幕VC液冷散热系统', 230, 1);
INSERT INTO `goods` VALUES (181, 'iQOO 80W 闪充套装', '/picture/1715568563390.jpg', '/picture/1715568563392.jpg', '/picture/1715568563394.jpg', 150, '线长约1米 | 多重安全防护 | 8A数据线 | 官方原装品质 | 最大输出规格11V/7.3A', 20, 3);
INSERT INTO `goods` VALUES (182, 'vivo 50W 立式无线充电器', '/picture/1715568689342.jpg', '/picture/1715568689370.jpg', '/picture/1715568689372.jpg', 439, '自适应升降充电 | 50W 无线超能闪充 | 高效风冷散热 | 多重安全保护（ 注：本品不含充电头和数据线）', 20, 3);
INSERT INTO `goods` VALUES (183, 'vivo Pad3 Pro 平板电脑 16GB+512GB 寒星灰', '/picture/1715568794019.jpg', '/picture/1715568794022.jpg', '/picture/1715568794025.jpg', 3999, '3.1K 144Hz 护眼巨幕 | 蓝晶×天玑9300 | 蓝心大模型', 30, 2);
INSERT INTO `goods` VALUES (184, 'iQOO Pad Air 8GB+256GB 灰晶', '/picture/1715568879689.jpg', '/picture/1715568879691.jpg', '/picture/1715568879701.jpg', 1999, '2.8K 144Hz 超感屏 | 高通骁龙870 | 3D全景声学系统', 20, 2);
INSERT INTO `goods` VALUES (185, 'iQOO WATCH eSIM版 浩宇黑 软胶', '/picture/1715569160787.jpg', '/picture/1715569160798.jpg', '/picture/1715569160800.jpg', 1199, '多通道健康运动监测 | ⾃研蓝河操作系统 | eSIM ⻓续航', 20, 2);
INSERT INTO `goods` VALUES (186, 'vivo Pencil2 触控笔标准版', '/picture/1715569279737.jpg', '/picture/1715569279738.jpg', '/picture/1715569279765.jpg', 499, '无线磁吸秒充 | 自然真实书写 | 软硬双效笔尖 | PPT 演讲控制', 20, 2);
INSERT INTO `goods` VALUES (187, 'vivo 6A Type-C to Type-C闪充数据线', '/picture/1715569385442.jpg', '/picture/1715569385444.jpg', '/picture/1715569385446.jpg', 45, '双Type-C接口设计 | 线长约1米 | 120W(20V/6A)及以下Type-C口充电器搭配本数据线可实现自身最大输出功率。', 230, 3);
INSERT INTO `goods` VALUES (188, 'vivo X100 保护膜', '/picture/1715569476389.jpg', '/picture/1715569476391.jpg', '/picture/1715569476393.jpg', 29, '【两片装】高清高透 | 耐磨耐脏 | 官方品质（温馨提醒：因机型更新迭代，产品适配机型以商详为准）', 100, 4);
INSERT INTO `goods` VALUES (189, '定制玻璃壳 iQOO Neo9', '/picture/1715569560601.jpg', '/picture/1715569560603.jpg', '/picture/1715569560605.jpg', 29, '个性定制图片、支持多款机型、高透玻璃背板', 50, 4);
INSERT INTO `goods` VALUES (190, 'iQOO Z9x 原装保护壳 透明', '/picture/1715569643865.jpg', '/picture/1715569643867.jpg', '/picture/1715569643894.jpg', 19, '手感顺滑 | 信号通畅 | 官方品质（温馨提醒：因机型更新迭代，产品描述适配机型以商详为准）', 20, 4);
INSERT INTO `goods` VALUES (191, 'vivo XE100 Type-C接口耳机', '/picture/1715569726188.jpg', '/picture/1715569726215.jpg', '/picture/1715569726217.jpg', 17, '三频均衡，音域广阔', 50, 5);
INSERT INTO `goods` VALUES (192, 'vivo TWS 4 真无线降噪耳机 远峰白', '/picture/1715569817078.jpg', '/picture/1715569817080.jpg', '/picture/1715569817082.jpg', 399, '高保真 Hi-Fi 级音质 | 55dB 深海降噪 | 45h 超长续航', 20, 5);
INSERT INTO `goods` VALUES (193, 'iQOO TWS 1e 真无线降噪耳机 星珠黄', '/picture/1715569888759.jpg', '/picture/1715569888762.jpg', '/picture/1715569888772.jpg', 169, '44h 超⻓续航 | 智能主动降噪 | 55ms 全链路游戏低延迟（温馨提示：本产品标配不含充电线）', 20, 5);
INSERT INTO `goods` VALUES (194, '宝斯登 TWS 1/TWS 3/3Pro 耳机保护套 深蓝', '/picture/1715569968279.jpg', '/picture/1715569968284.jpg', '/picture/1715569968286.jpg', 29, '便捷防摔 | 防尘设计 | 久用如新（温馨提示：1.耳机保护套不包含耳机；2.因机型更新迭代，产品适配机型以商详为准）', 50, 5);
INSERT INTO `goods` VALUES (195, '悦米 彩虹K歌音箱', '/picture/1715570040971.jpg', '/picture/1715570040974.jpg', '/picture/1715570040985.jpg', 399, '专业K歌DSP 35W大功率分频澎湃音质 | 无线K歌 | 360°多彩氛围灯', 50, 5);
INSERT INTO `goods` VALUES (196, '小度 智能音箱2 红外版', '/picture/1715570132048.jpg', '/picture/1715570132076.jpg', '/picture/1715570132078.jpg', 119, '语音遥控新老家电，千万家庭都说好。', 50, 5);
INSERT INTO `goods` VALUES (197, 'iQOO 磁吸散热背夹引磁片', '/picture/1715570199625.jpg', '/picture/1715570199628.jpg', '/picture/1715570199631.jpg', 19, 'iQOO磁吸散热背夹专属引磁片，一贴即合吸力稳定牢固', 50, 8);
INSERT INTO `goods` VALUES (198, 'iQOO 闪电游戏手柄2', '/picture/1715570296109.jpg', '/picture/1715570296120.jpg', '/picture/1715570296123.jpg', 170, 'Master Touch 背部触控 | 双触感电竞摇杆 | 闪电连击 | 全新防滑掌托', 50, 8);
INSERT INTO `goods` VALUES (199, 'iQOO 闪电手游指套', '/picture/1715570371124.jpg', '/picture/1715570371137.jpg', '/picture/1715570371142.jpg', 14, '两个装 高效吸湿透气 | 超高触控灵敏度 | 稳定操控感 | 0.3mm舒适佩戴', 50, 8);
INSERT INTO `goods` VALUES (200, '绿联 百变三脚架八爪支架', '/picture/1715570465988.jpg', '/picture/1715570465990.jpg', '/picture/1715570466000.jpg', 49, '任意弯折 | 坚实耐用 | 轻巧便携 |PAT云台锁', 20, 8);
INSERT INTO `goods` VALUES (201, '飞宇 三轴手机稳定器 VB3', '/picture/1715570551828.jpg', '/picture/1715570551830.jpg', '/picture/1715570551840.jpg', 559, 'Vlog和直播专业工具，收放自如，闪耀亮相。', 50, 8);
INSERT INTO `goods` VALUES (202, '乐橙 摄像机 TP7S-4M', '/picture/1715570673059.jpg', '/picture/1715570673061.jpg', '/picture/1715570673063.jpg', 269, '400W超清像素 | 智能巡航 | 声光告警', 50, 11);
INSERT INTO `goods` VALUES (203, '宾多康 智能颈部按摩仪', '/picture/1715570755026.jpg', '/picture/1715570755037.jpg', '/picture/1715570755039.jpg', 129, 'vivo智慧生活app控制 | 5种模式16档力度 | 恒温热敷 | 语音播报 | 智能定时 |轻巧便捷', 50, 11);
INSERT INTO `goods` VALUES (204, '电小酷 智能插座', '/picture/1715570839619.jpg', '/picture/1715570839621.jpg', '/picture/1715570839623.jpg', 39, 'vivo智慧生活app控制 | 语音控制 | 手机远程 | 定时开关 |3C认证', 20, 11);
INSERT INTO `goods` VALUES (205, '雷柏 无线蓝牙鼠标 M300G 黑', '/picture/1715570932596.jpg', '/picture/1715570932598.jpg', '/picture/1715570932599.jpg', 59, '三种连接模式，省心舒适；最多同时连接3台设备，并且可在3台设备间快速切换；鼠标精致小巧，专为中小手型与差旅用户打造。', 50, 11);
INSERT INTO `goods` VALUES (206, '雷柏 电脑高清摄像头 C260', '/picture/1715571022207.jpg', '/picture/1715571022209.jpg', '/picture/1715571022211.jpg', 135, '1080P自动对焦 清晰细微 | 95°大广角 视野广阔 | 全指向双重降噪麦克风 | 360°水平旋转 | 可调试底座', 50, 11);
INSERT INTO `goods` VALUES (207, '网易 超氧除味器', '/picture/1715571103587.jpg', '/picture/1715571103596.jpg', '/picture/1715571103599.jpg', 99, '冰箱净化小卫士 快速除菌除味', 20, 11);
INSERT INTO `goods` VALUES (208, '卓朗 便携式即热开水机', '/picture/1715571207108.jpg', '/picture/1715571207111.jpg', '/picture/1715571207121.jpg', 259, '秒速加热 | 五段调温 | 迷你便携', 50, 11);
INSERT INTO `goods` VALUES (209, 'ROCK 哆啦A梦相框小夜灯', '/picture/1715571295533.jpg', '/picture/1715571295544.jpg', '/picture/1715571295547.jpg', 59, '官方正版授权 | 高颜好玩 | 粉嫩少女心', 50, 11);
INSERT INTO `goods` VALUES (210, 'ROCK 哆啦A梦旋转加湿器', '/picture/1715571374443.jpg', '/picture/1715571374445.jpg', '/picture/1715571374449.jpg', 65, '官方正版授权，超长续航，温馨氛围灯，安然入眠', 20, 11);
INSERT INTO `goods` VALUES (211, '网易 国A级专业读写台灯', '/picture/1715571465249.jpg', '/picture/1715571465251.jpg', '/picture/1715571465280.jpg', 99, '无蓝光危害，无可视频闪，长时间使用也不易眼睛疲劳。', 50, 11);

-- ----------------------------
-- Table structure for info
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO `info` VALUES (1, '今晚准备吃什么');
INSERT INTO `info` VALUES (2, 'what is your name');
INSERT INTO `info` VALUES (3, 'Are you sure?');
INSERT INTO `info` VALUES (4, '我不理解');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `total` float NULL DEFAULT NULL,
  `amount` int NULL DEFAULT NULL,
  `status` tinyint(1) NULL DEFAULT NULL,
  `paytype` tinyint(1) NULL DEFAULT NULL,
  `name` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `phone` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `address` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `datetime` datetime NULL DEFAULT NULL,
  `user_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_user_id_idx`(`user_id` ASC) USING BTREE,
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 76 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for orderitem
-- ----------------------------
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `price` float NULL DEFAULT NULL,
  `amount` int NULL DEFAULT NULL,
  `goods_id` int NULL DEFAULT NULL,
  `order_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_order_id_idx`(`order_id` ASC) USING BTREE,
  INDEX `fk_orderitem_goods_id_idx`(`goods_id` ASC) USING BTREE,
  CONSTRAINT `fk_order_id` FOREIGN KEY (`order_id`) REFERENCES `order` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_orderitem_goods_id` FOREIGN KEY (`goods_id`) REFERENCES `goods` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 79 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of orderitem
-- ----------------------------

-- ----------------------------
-- Table structure for recommend
-- ----------------------------
DROP TABLE IF EXISTS `recommend`;
CREATE TABLE `recommend`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` tinyint(1) NULL DEFAULT NULL,
  `goods_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_goods_id_idx`(`goods_id` ASC) USING BTREE,
  CONSTRAINT `fk_goods_id` FOREIGN KEY (`goods_id`) REFERENCES `goods` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 45 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of recommend
-- ----------------------------
INSERT INTO `recommend` VALUES (42, 1, 1);
INSERT INTO `recommend` VALUES (43, 2, 1);
INSERT INTO `recommend` VALUES (44, 3, 1);
INSERT INTO `recommend` VALUES (46, 2, 181);
INSERT INTO `recommend` VALUES (47, 3, 182);
INSERT INTO `recommend` VALUES (48, 1, 183);
INSERT INTO `recommend` VALUES (49, 3, 184);
INSERT INTO `recommend` VALUES (50, 2, 182);
INSERT INTO `recommend` VALUES (51, 1, 185);
INSERT INTO `recommend` VALUES (52, 2, 183);
INSERT INTO `recommend` VALUES (53, 2, 185);
INSERT INTO `recommend` VALUES (55, 2, 187);
INSERT INTO `recommend` VALUES (56, 2, 191);
INSERT INTO `recommend` VALUES (57, 3, 192);
INSERT INTO `recommend` VALUES (58, 1, 193);
INSERT INTO `recommend` VALUES (59, 3, 197);
INSERT INTO `recommend` VALUES (60, 2, 196);
INSERT INTO `recommend` VALUES (61, 2, 197);
INSERT INTO `recommend` VALUES (62, 2, 198);
INSERT INTO `recommend` VALUES (63, 3, 198);
INSERT INTO `recommend` VALUES (64, 2, 199);
INSERT INTO `recommend` VALUES (65, 3, 200);
INSERT INTO `recommend` VALUES (66, 3, 201);
INSERT INTO `recommend` VALUES (67, 2, 202);
INSERT INTO `recommend` VALUES (68, 3, 203);
INSERT INTO `recommend` VALUES (69, 3, 204);
INSERT INTO `recommend` VALUES (70, 2, 205);
INSERT INTO `recommend` VALUES (71, 3, 207);
INSERT INTO `recommend` VALUES (72, 3, 209);
INSERT INTO `recommend` VALUES (73, 3, 210);
INSERT INTO `recommend` VALUES (74, 2, 209);
INSERT INTO `recommend` VALUES (75, 2, 210);
INSERT INTO `recommend` VALUES (76, 2, 211);

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `PASSWORD` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `NAME` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gender` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phonenumber` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `identitycode` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, '张三', '123', '张三', 'male', '13888888888', '110202107075023');

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES (1, '手机');
INSERT INTO `type` VALUES (2, '平板手表');
INSERT INTO `type` VALUES (3, '手机充电');
INSERT INTO `type` VALUES (4, '手机壳膜');
INSERT INTO `type` VALUES (5, '耳机音箱');
INSERT INTO `type` VALUES (8, '游戏摄影');
INSERT INTO `type` VALUES (11, '数码家电');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `email` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `password` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `name` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `phone` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `address` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `isadmin` bit(1) NULL DEFAULT NULL,
  `isvalidate` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username_UNIQUE`(`username` ASC) USING BTREE,
  UNIQUE INDEX `email_UNIQUE`(`email` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 'admin@vilicode.com', 'admin', '管理员', '1333333333', '中华人民共和国', b'1', b'0');
INSERT INTO `user` VALUES (2, 'vili', 'vili@vilicode.com', 'vili', 'vili', '1344444444', '中华人民共和国', b'0', b'0');
INSERT INTO `user` VALUES (37, '苗云龙', '12346789@qq.com', '123456789', '苗云龙', '138568123456', '吉林', b'0', b'0');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `NAME` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `PASSWORD` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `email` varchar(60) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'zs', '123456', 'zs@sina.com', '1980-12-04');
INSERT INTO `users` VALUES (2, 'lisi', '123456', 'lisi@sina.com', '1981-12-04');
INSERT INTO `users` VALUES (3, 'wangwu', '123456', 'wangwu@sina.com', '1979-12-04');
INSERT INTO `users` VALUES (4, 'zhaoxiaoliu', '456', 'zhaoxiaoliu@sina.com', '2024-05-11');
INSERT INTO `users` VALUES (5, 'hl', '123', 'hl@sina.com', '2024-05-11');

SET FOREIGN_KEY_CHECKS = 1;
