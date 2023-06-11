DROP PROCEDURE IF EXISTS insert_category;

DELIMITER //

CREATE PROCEDURE insert_category
(
var_category_id INT,
var_category_name varchar(50)
)
BEGIN
DECLARE sql_error TINYINT DEFAULT FALSE;
DECLARE CONTINUE HANDLER FOR SQLEXCEPTION
SET sql_error = TRUE;
START TRANSACTION;
UPDATE categories 
SET 
    category_id = var_category_id
WHERE
    category_name = var_category_name;
IF sql_error = FALSE THEN
COMMIT;
ELSE
ROLLBACK;
END IF;
END//


DELIMITER ;

-- Test fail: 
call insert_category (3,'Basses');

-- Test pass: 
call insert_category (4,'Piano');