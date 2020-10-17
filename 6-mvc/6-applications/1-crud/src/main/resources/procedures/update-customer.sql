DELIMITER //
DROP PROCEDURE IF EXISTS updateCustomer //
CREATE PROCEDURE updateCustomer(
    pFirstName VARCHAR(50),
    pLastName VARCHAR(50),
    pBirthDate DATE,
    pPhone VARCHAR(50),
    pAddress VARCHAR(50),
    pCity VARCHAR(50),
    pState VARCHAR(50),
    pPoints INT,
    pCustomerId INT
)
BEGIN
    UPDATE customers
    SET
        first_name = IFNULL(pFirstName, first_name),
        last_name = IFNULL(pLastName, last_name),
        birth_date = IFNULL(pBirthDate, birth_date),
        phone = IFNULL(pPhone, points),
        address = IFNULL(pAddress, address),
        city = IFNULL(pCity, city),
        state = IFNULL(pState, state),
        points = IFNULL(pPoints, points)
    WHERE customer_id = pCustomerId;
END //