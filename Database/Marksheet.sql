/*
SQLyog Ultimate - MySQL GUI v8.21 
MySQL - 5.1.53-community-log : Database - college
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`college` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `college`;

/*Table structure for table `default` */

DROP TABLE IF EXISTS `default`;

CREATE TABLE `default` (
  `Range of mark` varchar(59) DEFAULT NULL,
  `grade` varchar(100) DEFAULT NULL,
  `point` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `default` */

insert  into `default`(`Range of mark`,`grade`,`point`) values ('80 or above','A+','4.00'),('75 - below 80','A','3.75'),('70 - below 75','A-','3.50'),('65 - below 70','B+','3.25'),('60 - below 65','B','3.00'),('55 - below 60','B-','2.75'),('50 - below 55','C+','2.50'),('45 - below 50','C','2.25'),('40 - below 45','D','2.00'),('below 40','F','0.00');

/*Table structure for table `student_markshit` */

DROP TABLE IF EXISTS `student_markshit`;

CREATE TABLE `student_markshit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Stu_Name` varchar(255) DEFAULT NULL,
  `exam_date` varchar(255) DEFAULT NULL,
  `father_Name` varchar(255) DEFAULT NULL,
  `Grade` varchar(255) DEFAULT NULL,
  `mother_Name` varchar(255) DEFAULT NULL,
  `reg` varchar(255) DEFAULT NULL,
  `roll` varchar(255) DEFAULT NULL,
  `serial` varchar(255) DEFAULT NULL,
  `sessions` varchar(255) DEFAULT NULL,
  `subject_I` varchar(255) DEFAULT NULL,
  `subject_II` varchar(255) DEFAULT NULL,
  `subject_III` varchar(255) DEFAULT NULL,
  `subject_III_CH` varchar(255) DEFAULT NULL,
  `subject_III_GL` varchar(255) DEFAULT NULL,
  `subject_III_GP` varchar(255) DEFAULT NULL,
  `subject_II_CH` varchar(255) DEFAULT NULL,
  `subject_II_GL` varchar(255) DEFAULT NULL,
  `subject_II_GP` varchar(255) DEFAULT NULL,
  `subject_IV` varchar(255) DEFAULT NULL,
  `subject_IV_CH` varchar(255) DEFAULT NULL,
  `subject_IV_GL` varchar(255) DEFAULT NULL,
  `subject_IV_GP` varchar(255) DEFAULT NULL,
  `subject_IX` varchar(255) DEFAULT NULL,
  `subject_IX_CH` varchar(255) DEFAULT NULL,
  `subject_IX_GL` varchar(255) DEFAULT NULL,
  `subject_IX_GP` varchar(255) DEFAULT NULL,
  `subject_I_CH` varchar(255) DEFAULT NULL,
  `subject_I_GL` varchar(255) DEFAULT NULL,
  `subject_I_GP` varchar(255) DEFAULT NULL,
  `subject_V` varchar(255) DEFAULT NULL,
  `subject_VI` varchar(255) DEFAULT NULL,
  `subject_VII` varchar(255) DEFAULT NULL,
  `subject_VIII` varchar(255) DEFAULT NULL,
  `subject_VIII_CH` varchar(255) DEFAULT NULL,
  `subject_VIII_GL` varchar(255) DEFAULT NULL,
  `subject_VIII_GP` varchar(255) DEFAULT NULL,
  `subject_VII_CH` varchar(255) DEFAULT NULL,
  `subject_VII_GL` varchar(255) DEFAULT NULL,
  `subject_VII_GP` varchar(255) DEFAULT NULL,
  `subject_VI_CH` varchar(255) DEFAULT NULL,
  `subject_VI_GL` varchar(255) DEFAULT NULL,
  `subject_VI_GP` varchar(255) DEFAULT NULL,
  `subject_V_CH` varchar(255) DEFAULT NULL,
  `subject_V_GL` varchar(255) DEFAULT NULL,
  `subject_V_GP` varchar(255) DEFAULT NULL,
  `subject_X` varchar(255) DEFAULT NULL,
  `subject_X_CH` varchar(255) DEFAULT NULL,
  `subject_X_GL` varchar(255) DEFAULT NULL,
  `subject_X_GP` varchar(255) DEFAULT NULL,
  `exam_Name` varchar(255) DEFAULT NULL,
  `Semester` varchar(255) DEFAULT NULL,
  `subject_III_SC` varchar(255) DEFAULT NULL,
  `subject_II_SC` varchar(255) DEFAULT NULL,
  `subject_IV_SC` varchar(255) DEFAULT NULL,
  `subject_IX_SC` varchar(255) DEFAULT NULL,
  `subject_I_SC` varchar(255) DEFAULT NULL,
  `subject_VIII_SC` varchar(255) DEFAULT NULL,
  `subject_VII_SC` varchar(255) DEFAULT NULL,
  `subject_VI_SC` varchar(255) DEFAULT NULL,
  `subject_V_SC` varchar(255) DEFAULT NULL,
  `subject_X_SC` varchar(255) DEFAULT NULL,
  `reportId` int(11) NOT NULL,
  `subject_III_FM` varchar(255) DEFAULT NULL,
  `subject_II_FM` varchar(255) DEFAULT NULL,
  `subject_IV_FM` varchar(255) DEFAULT NULL,
  `subject_IX_FM` varchar(255) DEFAULT NULL,
  `subject_I_FM` varchar(255) DEFAULT NULL,
  `subject_VIII_FM` varchar(255) DEFAULT NULL,
  `subject_VII_FM` varchar(255) DEFAULT NULL,
  `subject_VI_FM` varchar(255) DEFAULT NULL,
  `subject_V_FM` varchar(255) DEFAULT NULL,
  `subject_X_FM` varchar(255) DEFAULT NULL,
  `subject_III_OB` varchar(255) DEFAULT NULL,
  `subject_II_OB` varchar(255) DEFAULT NULL,
  `subject_IV_OB` varchar(255) DEFAULT NULL,
  `subject_IX_OB` varchar(255) DEFAULT NULL,
  `subject_I_OB` varchar(255) DEFAULT NULL,
  `subject_VIII_OB` varchar(255) DEFAULT NULL,
  `subject_VII_OB` varchar(255) DEFAULT NULL,
  `subject_VI_OB` varchar(255) DEFAULT NULL,
  `subject_V_OB` varchar(255) DEFAULT NULL,
  `subject_X_OB` varchar(255) DEFAULT NULL,
  `Year` varchar(255) DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  `Faculties` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6698 DEFAULT CHARSET=latin1;

/*Data for the table `student_markshit` */

insert  into `student_markshit`(`id`,`Stu_Name`,`exam_date`,`father_Name`,`Grade`,`mother_Name`,`reg`,`roll`,`serial`,`sessions`,`subject_I`,`subject_II`,`subject_III`,`subject_III_CH`,`subject_III_GL`,`subject_III_GP`,`subject_II_CH`,`subject_II_GL`,`subject_II_GP`,`subject_IV`,`subject_IV_CH`,`subject_IV_GL`,`subject_IV_GP`,`subject_IX`,`subject_IX_CH`,`subject_IX_GL`,`subject_IX_GP`,`subject_I_CH`,`subject_I_GL`,`subject_I_GP`,`subject_V`,`subject_VI`,`subject_VII`,`subject_VIII`,`subject_VIII_CH`,`subject_VIII_GL`,`subject_VIII_GP`,`subject_VII_CH`,`subject_VII_GL`,`subject_VII_GP`,`subject_VI_CH`,`subject_VI_GL`,`subject_VI_GP`,`subject_V_CH`,`subject_V_GL`,`subject_V_GP`,`subject_X`,`subject_X_CH`,`subject_X_GL`,`subject_X_GP`,`exam_Name`,`Semester`,`subject_III_SC`,`subject_II_SC`,`subject_IV_SC`,`subject_IX_SC`,`subject_I_SC`,`subject_VIII_SC`,`subject_VII_SC`,`subject_VI_SC`,`subject_V_SC`,`subject_X_SC`,`reportId`,`subject_III_FM`,`subject_II_FM`,`subject_IV_FM`,`subject_IX_FM`,`subject_I_FM`,`subject_VIII_FM`,`subject_VII_FM`,`subject_VI_FM`,`subject_V_FM`,`subject_X_FM`,`subject_III_OB`,`subject_II_OB`,`subject_IV_OB`,`subject_IX_OB`,`subject_I_OB`,`subject_VIII_OB`,`subject_VII_OB`,`subject_VI_OB`,`subject_V_OB`,`subject_X_OB`,`Year`,`Type`,`Faculties`) values (6694,'sss','june - july 2017','Ekramul Hoq','3.06','Rasheda Akter','722178','868220','44444','2014-15','System Analysis Design & development','PLC','Computer Architechture','4','C+','2.50','2','B+','3.25','','','','','','','','','2','A+','4.00','','','','','','','','','','','','','','','','','','','','','SEVENTH SEMESTER EXAMINATION','seventh','6653','6674','','','7721','','','','','',0,'150','100','','','100','','','','','','75','65','','','88','','','','','','2007','RECONCILED','61 - Architecture and Interior Design Technology'),(6697,'Azizul Hoq','feb-march','Enamul Hoq','2.42','Aleya Begum','722192','868206','334443','2007-08','Engineering Drawing','Computer Fundamental','Computer Operation & Word Processing','1','B','3.00','3','C','2.25','Bangla -I','2','C','2.25','Basic Electricity','4','C','2.25','2','B+','3.25','English-I','Social Science-I (Civics)','Mathematics -I','Physics-I','4','C','2.25','4','D','2.00','2','C','2.25','2','B-','2.75','Physical Education','1','A','3.75','FIRST SEMESTER EXAMINATION','first','8843','2651','6673','1552','6672','1551','1355','5634','6670','1211',0,'50','150','100','200','100','200','200','100','100','50','32','68','45','99','69','91','85','45','57','38','2007','','66 - Computer Technology');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
