CREATE TABLE "tb_person" (
  "id" int(11) NOT NULL AUTO_INCREMENT,
  "user_name" varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  "age" int(11) DEFAULT NULL,
  "sex" tinyint(255) DEFAULT NULL,
  "address" varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  "create_time" timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  "update_time" timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  "is_del" tinyint(255) DEFAULT '1' COMMENT '1:正常 0:删除',
  PRIMARY KEY ("id"),
  KEY "age_index" ("age")
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

