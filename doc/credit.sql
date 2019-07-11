/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : credit_report

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 11/07/2019 13:46:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for properties
-- ----------------------------
DROP TABLE IF EXISTS `properties`;
CREATE TABLE `properties`  (
  `pid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '模板属性',
  `parent_pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '模板属性值ID',
  `parent_vid` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '模板属性上一级ID',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '模板属性名称',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '模板属性状态',
  `sort_order` int(255) DEFAULT NULL COMMENT '排序',
  `tid` int(11) DEFAULT NULL COMMENT '模板ID',
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of properties
-- ----------------------------
INSERT INTO `properties` VALUES (1, '0', '0', '担保信息', '1', 1, 1);
INSERT INTO `properties` VALUES (2, '0', '0', '资产信息', '1', 2, 1);
INSERT INTO `properties` VALUES (3, '0', '0', '基本经营信息', '1', 3, 1);
INSERT INTO `properties` VALUES (4, '0', '0', '银行流水分析', '0', 4, 1);
INSERT INTO `properties` VALUES (5, '0', '0', '综合分析及授信建议', '0', 5, 1);
INSERT INTO `properties` VALUES (6, '0', '0', '财务信息', '0', 6, 1);
INSERT INTO `properties` VALUES (7, '0', '0', '三方信息', '0', 7, 1);
INSERT INTO `properties` VALUES (8, '0', '0', '企业征信报告', '0', 8, 1);
INSERT INTO `properties` VALUES (9, '1', '1', '身份', '1', 1, 1);
INSERT INTO `properties` VALUES (10, '1', '1', '姓名', '1', 2, 1);
INSERT INTO `properties` VALUES (11, '1', '1', '婚姻情况', '1', 3, 1);
INSERT INTO `properties` VALUES (12, '1', '1', '信用状况', '1', 4, 1);
INSERT INTO `properties` VALUES (13, '1', '2', '身份', '1', 1, 1);
INSERT INTO `properties` VALUES (14, '1', '2', '姓名', '1', 2, 1);
INSERT INTO `properties` VALUES (15, '1', '2', '婚姻情况', '1', 3, 1);
INSERT INTO `properties` VALUES (16, '1', '2', '信用状况', '1', 4, 1);
INSERT INTO `properties` VALUES (17, '1', '3', '担保人类型', '1', 1, 1);
INSERT INTO `properties` VALUES (18, '1', '3', '姓名', '1', 2, 1);
INSERT INTO `properties` VALUES (19, '1', '3', '年龄', '1', 3, 1);
INSERT INTO `properties` VALUES (20, '1', '3', '户籍', '1', 4, 1);
INSERT INTO `properties` VALUES (21, '1', '3', '身份证号码', '1', 5, 1);

-- ----------------------------
-- Table structure for pvalue
-- ----------------------------
DROP TABLE IF EXISTS `pvalue`;
CREATE TABLE `pvalue`  (
  `vid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '属性值ID',
  `pid` bigint(255) DEFAULT NULL COMMENT '属性ID',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '属性值',
  `tid` bigint(255) DEFAULT NULL COMMENT '模板ID',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '模板值状态',
  `companyId` int(11) DEFAULT NULL COMMENT '公司ID',
  PRIMARY KEY (`vid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pvalue
-- ----------------------------
INSERT INTO `pvalue` VALUES (1, 1, '基本信息', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (2, 1, '实际控制人配偶', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (3, 1, '其他担保人', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (4, 2, '最高额担保企业', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (5, 2, '房产', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (6, 2, '车辆', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (7, 2, '家庭资产', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (8, 3, '基本信息', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (9, 3, '股东结构', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (10, 3, '股东变更记录（2年）', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (11, 3, '工商税务查处', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (12, 3, '动产抵押/股权质押', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (13, 3, '公司过往历史项目', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (14, 3, '关联公司', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (15, 9, '法人', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (16, 10, '张三', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (17, 11, '已婚', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (18, 12, '良好', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (19, 13, '配偶', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (20, 14, '李四', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (21, 15, '已婚', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (22, 16, '良好', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (23, 17, '最高担保人', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (24, 18, '王五', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (25, 19, '18', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (26, 20, '北京', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (27, 21, '1**************', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (28, 17, '最高担保人配偶', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (29, 18, '赵六', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (30, 19, '19', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (31, 20, '北京', 1, NULL, 0);
INSERT INTO `pvalue` VALUES (32, 21, '2************', 1, NULL, 0);

-- ----------------------------
-- Table structure for template
-- ----------------------------
DROP TABLE IF EXISTS `template`;
CREATE TABLE `template`  (
  `tid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '模板名称',
  `version` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '模板版本',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '模板类型',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`tid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of template
-- ----------------------------
INSERT INTO `template` VALUES (1, '工程授信报告模板', 'v1.0.0', '1', '1');

SET FOREIGN_KEY_CHECKS = 1;
