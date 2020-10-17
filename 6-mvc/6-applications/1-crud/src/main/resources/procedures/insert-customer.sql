DELIMITER //
DROP PROCEDURE IF EXISTS insertCustomer //
CREATE PROCEDURE insertCustomer(
    pFirstName VARCHAR(50),
    pLastName VARCHAR(50),
    pBirthDate DATE,
    pPhone VARCHAR(50),
    pAddress VARCHAR(50),
    pCity VARCHAR(50),
    pState VARCHAR(50),
    pPoints INT
)
BEGIN
    INSERT INTO customers(first_name, last_name, birth_date, phone, address, city, state, points)
    VALUES(pFirstName, pLastName, pBirthDate, pPhone, pAddress, pCity, pState, pPoints);
END //