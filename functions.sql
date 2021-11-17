use pharmacy_db;

SET GLOBAL log_bin_trust_function_creators = 1;
-- Task №1 для employee шукати MIN стовпця experience

DROP FUNCTION IF EXISTS get_min_working_experience;
DELIMITER // 
CREATE FUNCTION get_min_working_experience()
RETURNS DECIMAL(10,1) 
BEGIN
return(
SELECT MIN(experience)
FROM employee
);
END //  
DELIMITER ;


-- Task №2 витягує за ключем між employee та pharmacy об’єднане значення полів Назва та №будинку. 
DROP FUNCTION IF EXISTS get_bulding_name_num;
DELIMITER // 
CREATE FUNCTION get_bulding_name_num(
pharmacy_id INT
)
RETURNS VARCHAR(45)
BEGIN
RETURN(
    SELECT concat(pharmacy.name , pharmacy.building_number)
        from pharmacy 
        where id = (select pharmacy_id from employee where id = pharmacy_id)
       
);
END //  
DELIMITER ;

-- select get_min_working_experience();
-- select name, surname, middle_name, identity_number, passport_data, experience, birth_date,get_bulding_name_num(id) as solution from employee;
