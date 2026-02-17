# Write your MySQL query statement below
SELECT Product.product_name,Sales.year,Sales.price FROM Sales
LEFT JOIN Product ON Sales.product_Id=Product.product_Id;