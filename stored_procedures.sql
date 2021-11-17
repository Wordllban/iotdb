use pharmacy_db;
-- параметризована вставка в співробітники  (для пуськи)
DROP PROCEDURE IF EXISTS insert_into_employee;
DELIMITER //
CREATE PROCEDURE insert_into_employee(
name VARCHAR(45),
surname VARCHAR(45),
 middle_name VARCHAR(45),
 identity_number VARCHAR(20),
 passport_data VARCHAR(20),
 experience DECIMAL(10,1),
 birth_date DATE,
 post_id INT,
pharmacy_id INT 
)
BEGIN
INSERT INTO employee(name,surname,middle_name,identity_number,passport_data,experience,birth_date,post_id, pharmacy_id)
VALUES(name,surname,middle_name,identity_number,passport_data,experience,birth_date,post_id, pharmacy_id);
END //
DELIMITER ;


-- 2 завдання для пуськи
DROP PROCEDURE IF EXISTS insert_medicine_zone;
DELIMITER //
CREATE PROCEDURE insert_medicine_zone(
medicine_id INT,
zone_id INT
)
BEGIN
IF (SELECT id FROM medicine_list  where id = medicine_id)
AND  (SELECT id FROM effect_zone where id = zone_id)
THEN
INSERT INTO  medicine_zone(medicine_id, zone_id) VALUES (medicine_id, zone_id);
END IF ;
End //
DELIMITER ;

 -- 3 курсор
 
DROP PROCEDURE IF EXISTS employee_create_db;
 DELIMITER //
 CREATE PROCEDURE employee_create_db()
 BEGIN
	DECLARE done BOOL DEFAULT FALSE;
	DECLARE new_name VARCHAR(45);
    DECLARE new_surname VARCHAR(45);
    DECLARE surnames CURSOR 
    FOR SELECT name, surname from employee;
     DECLARE CONTINUE HANDLER
		FOR NOT FOUND SET done = TRUE;
	OPEN surnames;
    names_loop: 
    LOOP
    FETCH surnames INTO new_name, new_surname;
     IF done THEN leave names_loop;
     END IF;
     
     set @employee_db :=CONCAT('CREATE DATABASE IF NOT EXISTS ', new_name, new_surname,';');
      prepare query from @employee_db;
	  execute query;
	SET @table_count := 1;
    
    WHILE @table_count < rand() * 4
    DO
    		set @new_table = CONCAT( 'CREATE TABLE IF NOT EXISTS ', new_name, new_surname, '.', new_name, new_surname, @table_count, '( id INT, name VARCHAR(45), surname VARCHAR(45));');
            SELECT @new_table;
            prepare new_table_query from @new_table;
            execute new_table_query;
            SET @table_count = @table_count + 1;
        END WHILE;
        
    END LOOP;
    CLOSE surnames;	
END //
 Delimiter ;
    
    