-- Creating the stored procedure with cus_id and max_amount as parameters

DELIMITER //
CREATE PROCEDURE order_details (cus_id INT, max_amount INT)
BEGIN
SELECT Customers.customer_id, Customers.first_name, Orders.amount
FROM Customers
JOIN Orders
ON Customers.customer_id = Orders.customer_id
where Customers.customer_id = cus_id AND Orders.amount < max_amount;
END //
DELIMITER ;