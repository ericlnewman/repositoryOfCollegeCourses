SET GLOBAL log_bin_trust_function_creators = 1;
DROP FUNCTION IF EXISTS discount_price;

DELIMITER //
CREATE FUNCTION discount_price
(
item_id_param INT
)
RETURNS DECIMAL(9,2)
BEGIN
DECLARE discount_price_var DECIMAL(9,2);
SELECT item_price-discount_amount
INTO discount_price_var
FROM order_items
WHERE item_id= item_id_param;
RETURN discount_price_var;
END//

DELIMITER ;

-- Test pass: 
SELECT 
    DISCOUNT_PRICE(item_id) AS discount_price
FROM
    order_items
WHERE
    item_id = 3;