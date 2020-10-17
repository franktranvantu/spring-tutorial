DELIMITER //
DROP PROCEDURE IF EXISTS deleteCustomer //
CREATE PROCEDURE deleteCustomer(pCustomerId INT)
BEGIN
    DELETE FROM customers
    WHERE customer_id = pCustomerId;
END //