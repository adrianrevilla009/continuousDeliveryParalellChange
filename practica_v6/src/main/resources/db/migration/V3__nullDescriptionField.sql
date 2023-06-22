UPDATE book SET book.preface = book.description;
ALTER TABLE book modify COLUMN description varchar(5000) NULL DEFAULT NULL;