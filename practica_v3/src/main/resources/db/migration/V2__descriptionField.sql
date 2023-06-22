ALTER TABLE Book ADD preface varchar(255);
UPDATE Book SET Book.preface = Book.description