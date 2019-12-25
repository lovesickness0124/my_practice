/*
SQLyog Enterprise - MySQL GUI v6.14
MySQL - 5.5.27 : Database - bawei
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `bawei`;

USE `bawei`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `cms_article` */

DROP TABLE IF EXISTS `cms_article`;

CREATE TABLE `cms_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(128) DEFAULT NULL,
  `summary` varchar(144) DEFAULT NULL,
  `content` longtext NOT NULL,
  `picture` varchar(50) DEFAULT NULL,
  `hits` int(11) DEFAULT NULL,
  `hot` bit(1) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  `channel_id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_lfkytqlwoutq98g8j5f4ci62h` (`channel_id`),
  KEY `FK_2t7t521ow9c08uqbd9p11fsq4` (`category_id`),
  KEY `FK_p9jh9l0c468m5fxtcp1bcv3a6` (`user_id`),
  CONSTRAINT `FK_2t7t521ow9c08uqbd9p11fsq4` FOREIGN KEY (`category_id`) REFERENCES `cms_category` (`id`),
  CONSTRAINT `FK_lfkytqlwoutq98g8j5f4ci62h` FOREIGN KEY (`channel_id`) REFERENCES `cms_channel` (`id`),
  CONSTRAINT `FK_p9jh9l0c468m5fxtcp1bcv3a6` FOREIGN KEY (`user_id`) REFERENCES `cms_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `cms_article` */

insert  into `cms_article`(`id`,`title`,`summary`,`content`,`picture`,`hits`,`hot`,`status`,`deleted`,`created`,`updated`,`channel_id`,`category_id`,`user_id`) values (1,'惊人的大数据画像：你用什么手机，已透露了你的社会地位！','大数据，一直被认为是互联网公司的金矿，其多次利用潜力深不可测。所以基于市场调研或收集的相关数据，通过科学论断分析后，其显示出来的惊人画像有时准确的让人害怕。','<p>大数据，一直被认为是互联网公司的金矿，其多次利用潜力深不可测。所以基于市场调研或收集的相关数据，通过科学论断分析后，其显示出来的惊人画像有时准确的让人害怕。</p><p>这不，腾讯旗下企鹅智库于2019年1月通过对网民进行调研，并联合腾讯新闻于4月发布最新2019年智能手机、智能硬件购买意愿报告，最终得出的用户画像是这样子的。/p><p>先看小米：如果你是一二线城市用户，那选择小米手机的可能性会占据一半几率以上；而若再进一步，如果你处于一线城市，你选择小米的可能性要大于三星和华为这两大品牌。当然，从性别特点来说，男性用户选择小米的可能性更大，占比达到了61.8%。而在年龄分布方面，各阶段年龄在小米品牌中的分布比较均匀，其中又以20-39岁中青年用户占据主要地位，这可能与年轻人的冲劲及更追求极致体验有关。在月收入方面，3001-8000元档的用户占比最高，达38.4%。</p><p>再看华为：在选择华为手机的用户中，有超过60.9%的用户是年龄超过30岁的用户；而在使用华为手机的用户中，三个人中就有一个是年龄在40岁及以上段。当然，若是按所处城市的级别来分析，偏爱华为的用户，生活在三四线的比一二线的更明显。而从受教育的学历方面对比，有超过一半的用户是初中及以下学历，这说明了一个什么问题呢？各人就见仁见智吧！在月收入方面，3001-8000元档的用户比例最高，达到了40.7%。不过跟小米相比感觉占比并没外界传言的那样明显，只2个左右的百分点差异并不像传言的“领导用华为、屌丝用小米”说法。</p><p>最后看苹果：作为公认的最高端品牌定位，苹果iPhone的主力消费用户群体集中在20-39岁年龄段，总占比达到了67.9%，在19岁以下，苹果用户最少；如果考虑到学历分布，43.8%的用户在初中及以下，这是否说明土豪级别的相对比较低学历？另外从用户性别看，女性用户大大高于男性用户，可能iPhone作为一个面子问题，还是比较明显的。</p><p>先就说这么三个品牌吧，其它手机用户群体的用户画像分析后边再来。</p>','/upload/2afd6aca2c4147d0b34c31184c67569d.jpg',96,'',1,'\0','2019-12-03 13:36:40','2019-12-03 13:36:40',1,1,1);

/*Table structure for table `cms_category` */

DROP TABLE IF EXISTS `cms_category`;

CREATE TABLE `cms_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `sorted` int(11) DEFAULT NULL,
  `channel_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_ht3vk3a5838apbxow8dc6r6da` (`channel_id`),
  CONSTRAINT `FK_ht3vk3a5838apbxow8dc6r6da` FOREIGN KEY (`channel_id`) REFERENCES `cms_channel` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

/*Data for the table `cms_category` */

insert  into `cms_category`(`id`,`name`,`sorted`,`channel_id`) values (1,'互联网',0,1),(2,'软件',1,1),(3,'智能家居',2,1),(4,'虚拟货币',0,2),(5,'股票',1,2),(6,'外汇',2,2),(7,'黄金',3,2),(8,'宏观经济',4,2),(9,'美国',0,3),(10,'亚洲',1,3),(11,'欧洲',2,3),(12,'非洲',3,3),(13,'新车',0,4),(14,'SUV',1,4),(15,'汽车导购',2,4),(16,'用车',3,4),(17,'NBA',0,5),(18,'CBA',1,5),(19,'中超',2,5),(20,'意甲',3,5),(21,'电影',0,6),(22,'电视剧',1,6),(23,'综艺',2,6),(24,'明星八卦',3,6),(25,'段子',0,7),(26,'爆笑节目',1,7),(27,'童趣萌宠',2,7),(28,'雷人囧事',3,7);

/*Table structure for table `cms_channel` */

DROP TABLE IF EXISTS `cms_channel`;

CREATE TABLE `cms_channel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `icon` varchar(30) DEFAULT NULL,
  `sorted` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `cms_channel` */

insert  into `cms_channel`(`id`,`name`,`description`,`icon`,`sorted`) values (1,'科技',NULL,NULL,0),(2,'财经',NULL,NULL,1),(3,'国际',NULL,NULL,2),(4,'汽车',NULL,NULL,3),(5,'体育',NULL,NULL,4),(6,'娱乐',NULL,NULL,5),(7,'搞笑',NULL,NULL,6);

/*Table structure for table `cms_settings` */

DROP TABLE IF EXISTS `cms_settings`;

CREATE TABLE `cms_settings` (
  `id` int(11) NOT NULL,
  `site_domain` varchar(50) DEFAULT NULL,
  `site_name` varchar(50) DEFAULT NULL,
  `article_list_size` int(11) DEFAULT NULL,
  `slide_size` int(11) DEFAULT NULL,
  `admin_username` varchar(32) DEFAULT NULL,
  `admin_password` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cms_settings` */

insert  into `cms_settings`(`id`,`site_domain`,`site_name`,`article_list_size`,`slide_size`,`admin_username`,`admin_password`) values (1,'localhost','CMS内容管理系统',10,5,'admin','888888');

/*Table structure for table `cms_slide` */

DROP TABLE IF EXISTS `cms_slide`;

CREATE TABLE `cms_slide` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `picture` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `created` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `cms_slide` */

insert  into `cms_slide`(`id`,`title`,`picture`,`url`,`created`) values (1,'手工功能测试','http://www.ctufo.com/wp-content/uploads/2016/06/26b1OOOPIC32.jpg','https://ke.qq.com/course/311128','2019-12-02'),(2,'栗子网　写例子哥是认真的','/upload/66e796c3g755eaef7edc8&690.jpg','http://www.lizi.pw','2019-12-03');

/*Table structure for table `cms_user` */

DROP TABLE IF EXISTS `cms_user`;

CREATE TABLE `cms_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) NOT NULL,
  `password` varchar(32) NOT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `locked` bit(1) DEFAULT NULL,
  `created` date NOT NULL,
  `updated` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_m4o7s4w3o9o3www57522hfp8m` (`username`),
  KEY `idx_user_account` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `cms_user` */

insert  into `cms_user`(`id`,`username`,`password`,`nickname`,`birthday`,`gender`,`locked`,`created`,`updated`) values (1,'test','efbe40026c52c653374cc758bf5b5489','test',NULL,1,'\0','2019-12-03','2019-12-03'),(2,'yuanzhiping','8c49290b6a8f43671a3d983c4c0f633a','yuanzhiping',NULL,1,'\0','2019-12-08','2019-12-08');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
