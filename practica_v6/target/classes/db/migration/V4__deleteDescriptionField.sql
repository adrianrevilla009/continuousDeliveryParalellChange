ALTER TABLE book DROP description;

UPDATE book SET preface='' WHERE preface IS NULL;
ALTER TABLE book MODIFY preface VARCHAR(5000) NOT NULL;