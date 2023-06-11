SET GLOBAL log_bin_trust_function_creators = 1;

DROP FUNCTION IF EXISTS item_total;

DELIMITER //

CREATE FUNCTION item_total
(
  item_id_param INT(11)
)
RETURNS DECIMAL(10,2)
BEGIN
  DECLARE total_amount_var DECIMAL(10,2);
    
  SELECT quantity * DISCOUNT_PRICE(item_id_param)
  INTO   total_amount_var
  FROM   order_items
  WHERE  item_id = item_id_param;
    
  RETURN total_amount_var;
END//

DELIMITER ;

SELECT item_id, discount_price(item_id), quantity,
       item_total(item_id)
FROM order_items;