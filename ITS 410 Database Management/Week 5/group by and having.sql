SELECT * FROM orders
GROUP BY order_id HAVING order_id <= 10