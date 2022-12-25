
INSERT INTO member(mem_id,member_fn,member_ln,member_phone,member_address,member_reg_date,member_balance,member_late_fee) VALUES(200,'Kai','Havertz',3202821604,'53 Campus drive, Arlington','03-Aug-2021',134,20);
INSERT INTO member(mem_id,member_fn,member_ln,member_phone,member_address,member_reg_date,member_balance,member_late_fee) VALUES(203,'Armando','Broja',6512345613,'77 chepauk St,Saint Cloud','15-Oct-2022',200,0);
INSERT INTO member(mem_id,member_fn,member_ln,member_phone,member_address,member_reg_date,member_balance,member_late_fee) VALUES(201,'Mason','Mount',8630198335 ,'661 Park Avenue, Tampa ','10-May-2022',600,0);
INSERT INTO member(mem_id,member_fn,member_ln,member_phone,member_address,member_reg_date,member_balance,member_late_fee) VALUES(202,'Ben','Chilwell',7635551129 ,'525 18th Ave S, Vegas','13-Jun-2021',300,40);

INSERT INTO LOCATION VALUES (100, '628 8TH Ave E', 'St. Cloud', '3202336199', 'MN', 56301);
INSERT INTO LOCATION VALUES (101, '330 22nd Ave S', 'Tampa', '2397168892','FL', 33592);
INSERT INTO LOCATION VALUES (102, '44 Central Street W', 'Chicago' , '3120786159','IL' ,60007);
INSERT INTO LOCATION VALUES (103, '81 5th St S', 'Las Vegas' , '7126690023' ,'NV', 88901);

INSERT INTO manufacture(man_id,man_name,man_city)  VALUES ('A100','Redline','San Diego');
INSERT INTO manufacture(man_id,man_name,man_city)  VALUES ('B100','Trek bike','Waterloo');
INSERT INTO manufacture(man_id,man_name,man_city)  VALUES ('C100','Yeti','Phoenix');
INSERT INTO manufacture(man_id,man_name,man_city)  VALUES ('E100','Santa Cruz','St. Cloud');

INSERT INTO bike(bike_id, manufacturer_man_id,bike_category,bike_description,bike_status,bike_location,location_location_id) VALUES (1000,'A100','Mountain','Black','available','St. Cloud',100);
INSERT INTO bike(bike_id, manufacturer_man_id,bike_category,bike_description,bike_status,bike_location,location_location_id) VALUES (1001,'B100','Touring','White','available','Tampa',101);
INSERT INTO bike(bike_id, manufacturer_man_id,bike_category,bike_description,bike_status,bike_location,location_location_id) VALUES (1002,'C100','Track','Grey','available','Las Vegas',102);
INSERT INTO bike(bike_id, manufacturer_man_id,bike_category,bike_description,bike_status,bike_location,location_location_id) VALUES (1003,'E100','E-Bike','Pink','available','Elk River',103);


INSERT INTO staff(staff_id,staff_ln,staff_fn,staff_position,staff_address,staff_phone,location_location_id) VALUES('EJ','Eleanor','Jefferson','Customer support','1455 minnesota Blvd',3202374901,100);
INSERT INTO staff(staff_id,staff_ln,staff_fn,staff_position,staff_address,staff_phone,location_location_id) VALUES('JH','Jenny','Hobza','Sales','779 Hennepin Ave N',6501137293,101);
INSERT INTO staff(staff_id,staff_ln,staff_fn,staff_position,staff_address,staff_phone,location_location_id) VALUES('SK','Sarah','Kyle','Manager','331 Hemlock Lane',8861904520,102);
INSERT INTO staff(staff_id,staff_ln,staff_fn,staff_position,staff_address,staff_phone,location_location_id) VALUES('RJ','Reece','James','Customer support','115 6th St S',3202278136,103);



INSERT INTO transaction(transaction_id,member_mem_id,transaction_date) VALUES (111,200,'20-Oct-2022');
INSERT INTO transaction(transaction_id,member_mem_id,transaction_date) VALUES (222,201,'13-Nov-2022');
INSERT INTO transaction(transaction_id,member_mem_id,transaction_date) VALUES (333,202,'26-Nov-2022');
INSERT INTO transaction(transaction_id,member_mem_id,transaction_date) VALUES (444,203,'3-Dec-2022');

INSERT INTO rental_details(transaction_transaction_id,rental_fee_id,check_out_location,bike_bike_id,return_location, expire_date,actual_return_date, member_mem_id ) VALUES (111,101,'St. Cloud',1000,'St. Cloud','10-Oct-2022','11-Oct-2022',200);
INSERT INTO rental_details(transaction_transaction_id,rental_fee_id,check_out_location,bike_bike_id,return_location, expire_date,actual_return_date, member_mem_id ) VALUES (222,201,'Tampa',1001,'St. Cloud','10-Dec-2022','10-Dec-2022',203);
INSERT INTO rental_details(transaction_transaction_id,rental_fee_id,check_out_location,bike_bike_id,return_location, expire_date,actual_return_date, member_mem_id ) VALUES (333,501,'Las Vegas',1002,'Las Vegas','17-Dec-2022','18-Dec-2022',201);
INSERT INTO rental_details(transaction_transaction_id,rental_fee_id,check_out_location,bike_bike_id,return_location, expire_date,actual_return_date, member_mem_id ) VALUES (444,401,'Minneapolis',1003,'Elk River','20-Dec-2022','22-Dec-2022',202);


INSERT INTO fee(fee_id,daily_fee,rental_details_rental_fee_id) VALUES (601,80,101);
INSERT INTO fee(fee_id,daily_fee,rental_details_rental_fee_id) VALUES (701,95,201);
INSERT INTO fee(fee_id,daily_fee,rental_details_rental_fee_id) VALUES (801,100,501);
INSERT INTO fee(fee_id,daily_fee,rental_details_rental_fee_id) VALUES (901,105,401);