




CREATE TABLE book_mast (
  book_id varchar(15) COLLATE latin1_general_ci NOT NULL DEFAULT '',
  book_name varchar(50) COLLATE latin1_general_ci NOT NULL DEFAULT '',
  isbn_no varchar(15) COLLATE latin1_general_ci NOT NULL DEFAULT '',
  cate_id varchar(8) COLLATE latin1_general_ci NOT NULL DEFAULT '',
  aut_id varchar(8) COLLATE latin1_general_ci NOT NULL DEFAULT '',
  pub_id varchar(8) COLLATE latin1_general_ci NOT NULL DEFAULT '',
  dt_of_pub date NOT NULL DEFAULT '0000-00-00',
  pub_lang varchar(15) COLLATE latin1_general_ci DEFAULT NULL,
  no_page decimal(5,0) NOT NULL DEFAULT '0',
  book_price decimal(8,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`book_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;


