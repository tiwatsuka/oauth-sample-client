/* load the records. */
INSERT INTO users(username, password, enabled) VALUES('sample', '$2a$10$oxSJl.keBwxmsMLkcT9lPeAIxfNTPNQxpeywMrF7A3kVszwUTqfTK', true);
INSERT INTO authorities(username, authority) VALUES('sample', 'USER');
commit;