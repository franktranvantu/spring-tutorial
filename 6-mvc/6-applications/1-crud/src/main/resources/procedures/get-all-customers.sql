DELIMITER //
DROP PROCEDURE IF EXISTS getAllCustomers //
CREATE PROCEDURE getAllCustomers()
BEGIN
    SELECT customer_id, first_name, last_name, birth_date, phone, address, city, state, points
    FROM customers;
END //