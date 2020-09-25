/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : pmpsystem

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2020-09-25 09:29:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `empId` varchar(30) NOT NULL,
  `empName` varchar(20) DEFAULT NULL,
  `deptName` varchar(255) DEFAULT NULL,
  `joinProNums` int(30) DEFAULT NULL,
  PRIMARY KEY (`empId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('YG001', '周超', 'BI技术部', '2');
INSERT INTO `employee` VALUES ('YG002', '子圆', 'BI技术部', '2');
INSERT INTO `employee` VALUES ('YG003', '小明', 'SUNLIKE研发部', '3');
INSERT INTO `employee` VALUES ('YG004', '小红', 'SUNLIKE研发部', '4');
INSERT INTO `employee` VALUES ('YG005', '张单', 'SUNLIKE研发部', '4');
INSERT INTO `employee` VALUES ('YG006', '王为', 'SUNLIKE技术部', '4');
INSERT INTO `employee` VALUES ('YG007', '陈泽', 'UI设计部', '3');
INSERT INTO `employee` VALUES ('YG008', '周猛', 'ONLINE研发部', '3');
INSERT INTO `employee` VALUES ('YG009', '彬臣', 'ONLINE研发部', '2');
INSERT INTO `employee` VALUES ('YG010', '张磊', 'ONLINE技术部', '2');
INSERT INTO `employee` VALUES ('YG011', '子龙', '实施部', '4');
INSERT INTO `employee` VALUES ('YG012', '顺姐', '实施部', '3');
INSERT INTO `employee` VALUES ('YG013', '逍遥', '实施部', '3');
INSERT INTO `employee` VALUES ('YG014', '二狗', '销售部', '2');
INSERT INTO `employee` VALUES ('YG015', '东方', '销售部', '1');
INSERT INTO `employee` VALUES ('YG016', '老七', '销售部', '4');
INSERT INTO `employee` VALUES ('YG017', '阿西', 'BI研发部', '2');
INSERT INTO `employee` VALUES ('YG018', '重无', 'BI研发部', '2');
INSERT INTO `employee` VALUES ('YG019', '维科', 'BI研发部', '1');

-- ----------------------------
-- Table structure for `projects`
-- ----------------------------
DROP TABLE IF EXISTS `projects`;
CREATE TABLE `projects` (
  `proId` varchar(30) NOT NULL COMMENT '项目编号',
  `proName` varchar(30) DEFAULT NULL COMMENT '项目名称',
  `proBoss` varchar(20) DEFAULT NULL COMMENT '项目经理',
  `classNums` int(11) DEFAULT NULL COMMENT '项目成员数量',
  `proInves` decimal(20,2) DEFAULT NULL COMMENT '投入资金',
  `startTime` date DEFAULT NULL COMMENT '项目启动时间',
  `endTime` date DEFAULT NULL COMMENT '项目结束时间',
  `prepayDate` date DEFAULT NULL COMMENT '项目预交日期',
  PRIMARY KEY (`proId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of projects
-- ----------------------------
INSERT INTO `projects` VALUES ('XM001', '项目1', '王为', '8', '110000.00', '2019-07-05', '2019-10-15', '2019-10-15');
INSERT INTO `projects` VALUES ('XM002', '项目2', '王为', '6', '150000.00', '2019-08-20', '2019-09-18', '2019-09-03');
INSERT INTO `projects` VALUES ('XM003', '项目3', '王为', '5', '260000.00', '2019-08-15', '2019-09-30', '2019-09-30');
INSERT INTO `projects` VALUES ('XM004', '项目4', '王为', '9', '340000.00', '2019-06-03', '2019-11-20', '2019-11-20');
INSERT INTO `projects` VALUES ('XM005', '项目5', '二狗', '7', '80000.00', '2020-01-01', '2020-01-31', '2020-01-12');
INSERT INTO `projects` VALUES ('XM006', '项目6', '老七', '4', '200000.00', '2020-01-15', '2020-02-28', '2020-02-28');
INSERT INTO `projects` VALUES ('XM007', '项目7', '老七', '4', '650000.00', '2020-01-31', '2020-03-04', '2020-03-04');
INSERT INTO `projects` VALUES ('XM008', '项目8', '老七', '3', '112265.00', '2020-06-15', '2020-07-14', '2020-07-31');
INSERT INTO `projects` VALUES ('XM009', '项目9', '小明', '3', '500000.00', '2020-07-02', '2020-08-03', '2020-08-10');
INSERT INTO `projects` VALUES ('XM010', '项目10', '阿西', '2', '60000.00', '2020-07-12', '2020-07-12', '2020-09-30');

-- ----------------------------
-- Table structure for `projectsdetails`
-- ----------------------------
DROP TABLE IF EXISTS `projectsdetails`;
CREATE TABLE `projectsdetails` (
  `proId` varchar(255) NOT NULL COMMENT '项目编号',
  `proName` varchar(255) DEFAULT NULL COMMENT '项目名称',
  `proBoss` varchar(255) DEFAULT NULL COMMENT '项目经理',
  `FinishValue` varchar(255) DEFAULT NULL COMMENT '项目完成度',
  `xyCbValue` varchar(255) DEFAULT NULL COMMENT '效益成本比率',
  `invesValue` varchar(255) DEFAULT NULL COMMENT '投资回报率',
  `proInves` float(20,2) DEFAULT NULL COMMENT '项目总投入',
  `proIncome` float(20,2) DEFAULT NULL COMMENT '项目总收入',
  `startTime` date DEFAULT NULL COMMENT '开始日期',
  `endTime` date DEFAULT NULL COMMENT '结束日期',
  `prepayDate` date DEFAULT NULL COMMENT '预交日期',
  PRIMARY KEY (`proId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of projectsdetails
-- ----------------------------
INSERT INTO `projectsdetails` VALUES ('XM001', '项目1', '王为', '100.00%', '318.18%', '218.18%', '110000.00', '350000.00', '2019-07-05', '2019-10-15', '2019-10-15');
INSERT INTO `projectsdetails` VALUES ('XM002', '项目2', '王为', '100.00%', '266.67%', '166.67%', '150000.00', '400000.00', '2019-08-20', '2019-09-18', '2019-09-03');
INSERT INTO `projectsdetails` VALUES ('XM003', '项目3', '王为', '100.00%', '76.92%', '-23.08%', '260000.00', '200000.00', '2019-08-15', '2019-09-30', '2019-09-30');
INSERT INTO `projectsdetails` VALUES ('XM004', '项目4', '王为', '100.00%', '100.00%', '0.00%', '340000.00', '340000.00', '2019-06-03', '2019-11-20', '2019-11-20');
INSERT INTO `projectsdetails` VALUES ('XM005', '项目5', '二狗', '60.00%', '175.00%', '75.00%', '80000.00', '140000.00', '2020-01-01', '2020-01-31', '2020-01-12');
INSERT INTO `projectsdetails` VALUES ('XM006', '项目6', '老七', '100.00%', '185.00%', '85.00%', '200000.00', '370000.00', '2020-01-15', '2020-02-28', '2020-02-28');
INSERT INTO `projectsdetails` VALUES ('XM007', '项目7', '老七', '80.00%', '70.77%', '-29.23%', '650000.00', '460000.00', '2020-01-31', '2020-03-04', '2020-03-04');
INSERT INTO `projectsdetails` VALUES ('XM008', '项目8', '老七', '100.00%', '160.33%', '60.33%', '112265.00', '180000.00', '2020-06-15', '2020-07-14', '2020-07-31');
INSERT INTO `projectsdetails` VALUES ('XM009', '项目9', '小明', '100.00%', '168.00%', '68.00%', '500000.00', '840000.00', '2020-07-02', '2020-08-03', '2020-08-10');
INSERT INTO `projectsdetails` VALUES ('XM010', '项目10', '阿西', '40.00%', '0.00%', '0.00%', '60000.00', '0.00', '2020-07-12', '1999-09-09', '2020-09-30');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(20) NOT NULL DEFAULT '',
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('011', '123');
