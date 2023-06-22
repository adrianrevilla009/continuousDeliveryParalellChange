ALTER TABLE book ADD price_float float;
UPDATE book SET book.price_float = CAST(book.price AS FLOAT);
