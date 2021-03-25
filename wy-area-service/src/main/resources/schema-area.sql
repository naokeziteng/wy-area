DROP TABLE IF EXISTS `area_area`;

CREATE TABLE `area_area`(
  `id` int(10) NOT NULL COMMENT 'id',
  `name` varchar(256) COMMENT '名称',
  `level` int(1) COMMENT '级别',
  `code` varchar(10) COMMENT '行政区划代码',
  `parent_id` int(10) COMMENT '上级id',
  `full_name` varchar(256) COMMENT '全称',
  `longitude` double COMMENT '上级id',
  `latitude` double COMMENT '上级id',
  primary key(`id`)
)
ENGINE=innodb DEFAULT CHARACTER SET utf8mb4
COMMENT '省市区表';