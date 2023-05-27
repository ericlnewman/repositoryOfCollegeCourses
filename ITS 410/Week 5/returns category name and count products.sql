SELECT 
    c.category_name,
    COUNT(p.product_id) AS count,
    MAX(p.list_price)
FROM
    categories AS c
        INNER JOIN
    products p ON c.category_id = p.category_id
GROUP BY c.category_name
ORDER BY count DESC;
