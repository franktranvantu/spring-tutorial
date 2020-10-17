DELIMITER //
DROP PROCEDURE IF EXISTS getCustomerById //
CREATE PROCEDURE getCustomerById(pCustomerId INT)
BEGIN
    SELECT customer_id, first_name, last_name, birth_date, phone, address, city, state, points
    FROM customers
    WHERE customer_id = pCustomerId;
END //