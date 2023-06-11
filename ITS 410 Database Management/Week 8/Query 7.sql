SELECT 
    COALESCE(p.product_name, 'Grand Total') AS 'Product Name',
    SUM(o.item_price - o.discount_amount) * COUNT(o.item_id) as 'Total Amount'
FROM
    products p
        LEFT JOIN
    order_items o ON p.product_id = o.product_id
GROUP BY p.product_name WITH ROLLUP;