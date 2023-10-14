-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: shudian
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `bookID` int NOT NULL AUTO_INCREMENT,
  `bookTitle` varchar(10) DEFAULT NULL COMMENT '书名',
  `publishDate` date DEFAULT NULL COMMENT '发行时间',
  `price` double DEFAULT NULL COMMENT '价格',
  `author` varchar(10) DEFAULT NULL COMMENT '作者',
  `storeNo` int DEFAULT NULL COMMENT '库存数量',
  `storeDate` date DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`bookID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='书籍表 ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `company` (
  `companyID` int NOT NULL AUTO_INCREMENT COMMENT ' 主键 ',
  `companyTitle` varchar(10) DEFAULT NULL COMMENT ' 配送公司名称 ',
  `address` varchar(20) DEFAULT NULL COMMENT ' 地址 ',
  `contactPerson` varchar(5) DEFAULT NULL COMMENT ' 配送公司负责人 ',
  `telephone` varchar(11) DEFAULT NULL COMMENT ' 手机号 ',
  `email` varchar(20) DEFAULT NULL COMMENT ' 邮箱 ',
  PRIMARY KEY (`companyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT=' 配送公司表 ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `employeeNo` int NOT NULL COMMENT '职员编号',
  `empPassword` varchar(10) NOT NULL COMMENT '登录密码',
  `empName` varchar(5) DEFAULT NULL COMMENT '员工姓名',
  `empSex` varchar(1) DEFAULT NULL COMMENT '员工性别',
  `empBirthday` date DEFAULT NULL COMMENT '出生日期',
  `Department` varchar(30) DEFAULT NULL COMMENT '部门',
  `title` varchar(20) DEFAULT NULL COMMENT '职    务',
  `Salary` int DEFAULT NULL COMMENT '薪水',
  `enpAddress` varchar(40) DEFAULT NULL COMMENT '员工住址',
  `empTelephone` varchar(15) DEFAULT NULL COMMENT '手机号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='员工表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory` (
  `purchaseNo` int NOT NULL AUTO_INCREMENT,
  `ISBN` varchar(30) DEFAULT NULL COMMENT '书籍版号',
  `BookName` varchar(30) DEFAULT NULL COMMENT '书籍名称',
  `storeNo` int DEFAULT NULL COMMENT '库存数量',
  `storeDate` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`purchaseNo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='库存表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (1,'12345','张恩与水',0,'2023-06-27 07:41:08');
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `memberNo` int NOT NULL COMMENT '用户编号',
  `memPassword` varchar(10) NOT NULL COMMENT '登录密码',
  `memName` varchar(5) DEFAULT NULL COMMENT '姓名',
  `memSex` varchar(1) DEFAULT NULL COMMENT '性别',
  `memBirthday` date DEFAULT NULL COMMENT '出生日期',
  `enpAddress` varchar(40) DEFAULT NULL COMMENT '住址',
  `empTelephone` varchar(15) DEFAULT NULL COMMENT '手机号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='会员表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `message` (
  `messageNo` int NOT NULL COMMENT '留言编号',
  `messageContent` varchar(100) DEFAULT NULL COMMENT '留言内容'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='留言表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messagereply`
--

DROP TABLE IF EXISTS `messagereply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `messagereply` (
  `messageNo` int NOT NULL COMMENT '回复编号',
  `messageContent` varchar(100) DEFAULT NULL COMMENT '回复内容'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='回复表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messagereply`
--

LOCK TABLES `messagereply` WRITE;
/*!40000 ALTER TABLE `messagereply` DISABLE KEYS */;
/*!40000 ALTER TABLE `messagereply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `user` varchar(15) DEFAULT NULL,
  `orderBook` varchar(10) DEFAULT NULL COMMENT '订购书籍',
  `orderNumber` int DEFAULT NULL COMMENT '数量',
  `sum` double DEFAULT NULL COMMENT '总价',
  `state` varchar(2) DEFAULT NULL COMMENT '状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `press`
--

DROP TABLE IF EXISTS `press`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `press` (
  `pressID` int NOT NULL AUTO_INCREMENT,
  `pressTitle` varchar(10) DEFAULT NULL COMMENT ' 出版社名称 ',
  `address` varchar(20) DEFAULT NULL COMMENT ' 地址 ',
  `contactPerson` varchar(5) DEFAULT NULL COMMENT ' 配送公司负责人 ',
  `telephone` varchar(11) DEFAULT NULL COMMENT ' 手机号 ',
  `email` varchar(20) DEFAULT NULL COMMENT ' 邮箱 ',
  PRIMARY KEY (`pressID`)
) ENGINE=InnoDB AUTO_INCREMENT=123457 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT=' 出版社表 ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `press`
--

LOCK TABLES `press` WRITE;
/*!40000 ALTER TABLE `press` DISABLE KEYS */;
INSERT INTO `press` VALUES (123456,'杀生丸','三个VS的温柔','都搞不定','送到公司官网','关心过VS更为深入推进');
/*!40000 ALTER TABLE `press` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchase` (
  `purchaseNo` int NOT NULL AUTO_INCREMENT,
  `ISBN` varchar(30) DEFAULT NULL COMMENT '书籍版号',
  `BookName` varchar(30) DEFAULT NULL COMMENT '书籍名称',
  `PurchaseNum` int DEFAULT NULL COMMENT '采购数量',
  `PurchaseStatus` tinyint(1) DEFAULT NULL COMMENT '采购状态',
  `storeDate` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`purchaseNo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='采购表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase`
--

LOCK TABLES `purchase` WRITE;
/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
INSERT INTO `purchase` VALUES (1,'7587867','的观点',788,1,'2023-06-27 07:02:22'),(2,'1','西瓜王子',98,0,'2023-06-27 08:35:30');
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipsheet`
--

DROP TABLE IF EXISTS `shipsheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shipsheet` (
  `orderNo` int NOT NULL AUTO_INCREMENT COMMENT ' 订单号 ',
  `receiver` varchar(5) DEFAULT NULL COMMENT ' 收件人 ',
  `Tele` varchar(10) DEFAULT NULL COMMENT '收件人电话',
  `shipAddress` varchar(20) DEFAULT NULL COMMENT ' 配送地址 ',
  `ShipStatus` tinyint(1) DEFAULT NULL COMMENT '配送状态',
  PRIMARY KEY (`orderNo`)
) ENGINE=InnoDB AUTO_INCREMENT=75753 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT=' 配送单表 ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipsheet`
--

LOCK TABLES `shipsheet` WRITE;
/*!40000 ALTER TABLE `shipsheet` DISABLE KEYS */;
INSERT INTO `shipsheet` VALUES (12,'张三','12354','士大夫萨芬',0),(75752,'高污染','42787732','三个VS',1);
/*!40000 ALTER TABLE `shipsheet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop`
--

DROP TABLE IF EXISTS `shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shop` (
  `user` varchar(15) DEFAULT NULL COMMENT '用户',
  `shopBook` varchar(10) DEFAULT NULL COMMENT '购买书籍',
  `number` int DEFAULT NULL COMMENT '数量'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='购物车表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop`
--

LOCK TABLES `shop` WRITE;
/*!40000 ALTER TABLE `shop` DISABLE KEYS */;
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-27 17:00:16
