SELECT 
    c.email_address,
    SUM(o.item_price) * COUNT(o.item_id) AS first_sum_by_count,
    SUM(o.discount_amount) * COUNT(o.item_id) AS second_sum_by_count
FROM
    customers AS c
        INNER JOIN
    orders AS ord ON c.customer_id = ord.customer_id
        INNER JOIN
    order_items AS o ON o.order_id = ord.order_id
GROUP BY c.customer_id
ORDER BY SUM(o.item_price) DESC;