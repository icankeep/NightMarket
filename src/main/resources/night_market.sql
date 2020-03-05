/*
Navicat MySQL Data Transfer

Source Server         : passer
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : night_market

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2020-03-05 21:05:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `log`
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `operate_user_id` int(11) DEFAULT NULL COMMENT '操作人id',
  `operate_time` datetime DEFAULT NULL COMMENT '操作时间',
  `operate_type` tinyint(4) DEFAULT NULL COMMENT '操作事件类型(0登录，1发布公告，2提交申请，3通过申请，4确认付款发送付款订单号，5确认收款，6修改密码，7修改个人信息)',
  `login_ip` varchar(30) DEFAULT NULL COMMENT '登录ip',
  `operate_user_nickname` varchar(50) DEFAULT NULL COMMENT '操作人昵称',
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作日志和登录日志表';

-- ----------------------------
-- Records of log
-- ----------------------------

-- ----------------------------
-- Table structure for `notice`
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `notice_id` int(11) NOT NULL AUTO_INCREMENT,
  `notice_title` varchar(50) DEFAULT NULL COMMENT '公告标题',
  `notice_content` varchar(500) DEFAULT NULL COMMENT '公告内容',
  `release_user_id` int(11) DEFAULT NULL COMMENT '发布人id',
  `release_time` datetime DEFAULT NULL COMMENT '发布时间',
  `release_user_nickname` varchar(50) DEFAULT NULL COMMENT '发布人昵称',
  PRIMARY KEY (`notice_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES ('1', '租户注意', '疫情严重，出门戴好口罩', '1', '2020-03-04 17:13:03', 'passer');
INSERT INTO `notice` VALUES ('2', '发布公告测试', '啦啦啦啦啦啦哈哈哈哈', '1', '2020-03-05 05:53:28', 'passer');

-- ----------------------------
-- Table structure for `relation`
-- ----------------------------
DROP TABLE IF EXISTS `relation`;
CREATE TABLE `relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id1` int(11) DEFAULT NULL,
  `user_id2` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of relation
-- ----------------------------
INSERT INTO `relation` VALUES ('1', '4', '1');
INSERT INTO `relation` VALUES ('2', '4', '1');

-- ----------------------------
-- Table structure for `stall`
-- ----------------------------
DROP TABLE IF EXISTS `stall`;
CREATE TABLE `stall` (
  `stall_id` int(11) NOT NULL AUTO_INCREMENT,
  `stall_name` varchar(30) DEFAULT NULL COMMENT '摊位号，摊位名，用于用户辨识',
  `stall_address` varchar(200) DEFAULT NULL COMMENT '摊位地址',
  `stall_info` varchar(500) DEFAULT NULL COMMENT '摊位描述信息',
  `stall_rent` decimal(10,2) DEFAULT NULL COMMENT '租金',
  `is_rented` tinyint(1) DEFAULT NULL COMMENT '是否已被出租',
  `rented_time` datetime DEFAULT NULL COMMENT '若出租，出租的时间，未被出租为空',
  `user_id` int(11) DEFAULT NULL COMMENT '摊位所属管理员id',
  `user_nickname` varchar(50) DEFAULT NULL COMMENT '所属管理员昵称',
  PRIMARY KEY (`stall_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='摊位表';

-- ----------------------------
-- Records of stall
-- ----------------------------
INSERT INTO `stall` VALUES ('1', '摊位test', '上海市浦东新区xxx', null, '999.00', '1', '2020-03-04 17:46:08', '1', 'passer');
INSERT INTO `stall` VALUES ('2', 'Z1234', '北京市海淀区xxx', null, '888.00', '1', '2020-03-05 13:02:05', '1', 'passer');

-- ----------------------------
-- Table structure for `stall_apply`
-- ----------------------------
DROP TABLE IF EXISTS `stall_apply`;
CREATE TABLE `stall_apply` (
  `apply_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `stall_id` int(11) DEFAULT NULL COMMENT '摊位id',
  `stall_status` tinyint(4) DEFAULT NULL COMMENT '摊位状态(0待管理员通过申请,1待租户付款,2待管理员确认已付款)',
  `apply_time` datetime DEFAULT NULL,
  `other_user_id` int(11) DEFAULT NULL COMMENT '收到申请的用户id',
  `deal` tinyint(1) DEFAULT NULL COMMENT '该申请是否已被处理',
  `user_nickname` varchar(50) DEFAULT NULL,
  `other_user_nickname` varchar(50) DEFAULT NULL,
  `pay_account` varchar(30) DEFAULT NULL COMMENT '支付账号',
  `pay_order_number` varchar(100) DEFAULT NULL COMMENT '支付订单号',
  PRIMARY KEY (`apply_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stall_apply
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `nickname` varchar(50) DEFAULT NULL COMMENT '用户昵称',
  `real_name` varchar(30) DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(50) DEFAULT NULL COMMENT '用户密码',
  `phone_number` varchar(11) DEFAULT NULL COMMENT '手机号',
  `is_admin` tinyint(1) DEFAULT NULL COMMENT '是否为管理员',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `icon_path` varchar(100) DEFAULT NULL COMMENT '头像路径',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'passer', 'real', '147258', '17691215797', '1', '北京市', null);
INSERT INTO `user` VALUES ('4', 'passe', 'zhou', '147369', '121212', '0', 'root', null);

-- ----------------------------
-- Table structure for `user_pay`
-- ----------------------------
DROP TABLE IF EXISTS `user_pay`;
CREATE TABLE `user_pay` (
  `pay_id` int(11) NOT NULL AUTO_INCREMENT,
  `pay_user_id` int(11) DEFAULT NULL COMMENT '支付的用户id',
  `pay_money` decimal(10,2) DEFAULT NULL COMMENT '变化金额',
  `pay_time` datetime DEFAULT NULL COMMENT '支付时间',
  `pay_comment` varchar(500) DEFAULT NULL COMMENT '来源或者去向备注',
  `income_user_id` int(11) DEFAULT NULL COMMENT '收入的用户id',
  `pay_user_nickname` varchar(50) DEFAULT NULL COMMENT '支付的用户昵称',
  `income_user_nickname` varchar(50) DEFAULT NULL COMMENT '收入的用户昵称',
  PRIMARY KEY (`pay_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='用户收入支出表';

-- ----------------------------
-- Records of user_pay
-- ----------------------------
INSERT INTO `user_pay` VALUES ('3', '4', '999.00', '2020-03-04 17:46:08', '17691215797###xxx123435555', '1', 'passe', 'passer');
INSERT INTO `user_pay` VALUES ('4', '4', '888.00', '2020-03-05 13:02:05', '17691215797###xxx177777777777', '1', 'passe', 'passer');

-- ----------------------------
-- Table structure for `user_stall`
-- ----------------------------
DROP TABLE IF EXISTS `user_stall`;
CREATE TABLE `user_stall` (
  `user_stall_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `stall_id` int(11) DEFAULT NULL COMMENT '摊位id',
  PRIMARY KEY (`user_stall_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_stall
-- ----------------------------
INSERT INTO `user_stall` VALUES ('1', '4', '1');
INSERT INTO `user_stall` VALUES ('2', '4', '2');
