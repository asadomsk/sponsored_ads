DROP TABLE IF EXISTS CAMPAIGN;

CREATE TABLE CAMPAIGN (
  campaign_id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  start_date DATE NOT NULL,
  category VARCHAR(250) NOT NULL,
  bid DECIMAL NOT NULL
);


CREATE TABLE IF NOT EXISTS PRODUCT (
  product_id INT AUTO_INCREMENT  PRIMARY KEY,
  title varchar(255) NOT NULL,
  category  varchar(255) NOT NULL,
  price DECIMAL NOT NULL,
  serial_Num INT NOT NULL
);

CREATE TABLE IF NOT EXISTS CAMP_PROD (
  campaign_id INT,
  product_id INT
);
