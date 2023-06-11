SELECT 
    product_name AS 'The product name',
    list_price AS 'The list price',
    discount_percent AS 'The discount percent',
    ROUND(list_price * (discount_percent / 100), 2) AS 'The discount amount',
    ROUND(list_price - list_price * (discount_percent / 100),
            2) AS 'The discount price'
FROM
    products
ORDER BY (list_price - list_price * (discount_percent / 100)) DESC
LIMIT 5;
