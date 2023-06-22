ALTER TABLE book ADD preface varchar(255);
UPDATE book SET book.preface = book.description;