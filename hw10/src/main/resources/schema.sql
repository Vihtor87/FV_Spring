CREATE TABLE IF NOT EXISTS Note(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    description VARCHAR(400) NOT NULL,
    createdDate TIMESTAMP
);