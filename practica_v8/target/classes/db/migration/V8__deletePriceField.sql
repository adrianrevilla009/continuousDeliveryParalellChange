ALTER TABLE book DROP price;

UPDATE book SET price_float='' WHERE price_float IS NULL;
ALTER TABLE book MODIFY price_float FLOAT NOT NULL;