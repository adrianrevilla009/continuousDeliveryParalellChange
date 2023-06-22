UPDATE book SET book.price_float = CAST(book.price AS FLOAT);
ALTER TABLE book modify COLUMN price INT NULL DEFAULT NULL;