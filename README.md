# Two project 1>BackEnd 2>FrontEnd
#BackEnd->mvn clean install
#front end->mvn clean install
#run as server

Next 

 * Admin can add product to the product list
  * Admin can edit the product details
  * Admin can delete the product from the list

  Table for Product

  create table ITEM
(
  ID               VARCHAR2(20 CHAR) not null,
  CATEGORY  VARCHAR2(20 CHAR) not null,
  DESCRPTION  VARCHAR2(20 CHAR) ,
  MANUFACTURER VARCHAR2(20 CHAR) ,
  NAME        VARCHAR2(255 CHAR) not null,
  PRICE       DOUBLE not null,
 UNIT            VARCHAR2(20 CHAR) ,
  IMAGE       BLOB,
  CREATE_DATE DATE default sysdate not null
) ;

alter table ITEM
  add primary key (ID) ;
