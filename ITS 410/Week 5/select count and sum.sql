SELECT 
    COUNT(order_id), SUM(tax_amount)
FROM
    orders;