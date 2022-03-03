INSERT INTO person (id, name) VALUES(1, 'Alice') ON DUPLICATE KEY UPDATE name = 'Alice2';
