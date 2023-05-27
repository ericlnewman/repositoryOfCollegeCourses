SELECT 
    item_id AS 'The item id',
    item_price AS 'The item price',
    discount_amount AS 'The discount amount',
    quantity AS 'The quantity',
    (item_price * quantity) AS 'The price total',
    (discount_amount * quantity) AS 'The discount_total',
    ((item_price - discount_amount) * quantity) AS 'The item total'
FROM
    order_items
WHERE
    ((item_price - discount_amount) * quantity) > 500
ORDER BY ((item_price - discount_amount) * quantity) DESC;