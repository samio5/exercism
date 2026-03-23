-- Schema: CREATE TABLE "twofer" ("Input" TEXT, "Response" TEXT);
-- Task: update the twofer table and set the response based on the input.

UPDATE twofer
SET response = 'One for ' || 
               CASE 
                   WHEN input = '' THEN 'you' 
                   ELSE input 
               END 
               || ', one for me.';
