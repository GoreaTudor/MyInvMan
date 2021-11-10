DROP VIEW IF EXISTS users;
DROP VIEW IF EXISTS admins;
DROP TABLE IF EXISTS user_table;

CREATE TABLE user_table (
	username VARCHAR(20) NOT NULL,
    password INT NOT NULL,
    isAdmin TINYINT NOT NULL,
    PRIMARY KEY (username)
);

CREATE VIEW users AS
SELECT username, password
FROM user_table
WHERE isAdmin = false;

CREATE VIEW admins AS
SELECT username, password
FROM user_table
WHERE isAdmin = true;

INSERT INTO user_table VALUES ('admin1', 2432963, true); /* password = 1234 */
INSERT INTO user_table VALUES ('admin2', 2463747, true); /* password = 2345 */
INSERT INTO user_table VALUES ('user1', 2431937, false); /* password = 1111 */
INSERT INTO user_table VALUES ('user2', 2462721, false); /* password = 2222 */
INSERT INTO user_table VALUES ('user3', 2493505, false); /* password = 3333 */
INSERT INTO user_table VALUES ('user4', 2524289, false); /* password = 4444 */
INSERT INTO user_table VALUES ('user5', 2555073, false); /* password = 5555 */
