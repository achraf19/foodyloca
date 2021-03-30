CREATE TABLE IF NOT EXISTS company (
    id INT NOT NULL PRIMARY KEY,
    companyName VARCHAR(20),
    founded DATE DEFAULT CURRENT_DATE,
    speciality VARCHAR(40),
    typeOfCompany VARCHAR(20),
    rating NUMERIC(2, 1) NOT NULL,
    deliveryTime INT,
    phoneNumber VARCHAR(10),
    email VARCHAR(30),
    address JSON,
    foods JSON
)
