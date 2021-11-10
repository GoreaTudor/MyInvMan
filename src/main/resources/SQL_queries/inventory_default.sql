DROP VIEW IF EXISTS inventory_view;
DROP TABLE IF EXISTS inventory;

CREATE TABLE inventory (
	username VARCHAR(20) NOT NULL,
    item_id INT NOT NULL,
    quantity INT NOT NULL,
    PRIMARY KEY(username, item_id)
);

CREATE VIEW inventory_view AS
SELECT user_table.username, user_table.isAdmin, item_table.item_name, inventory.quantity, item_table.item_description
FROM user_table
LEFT JOIN inventory ON user_table.username = inventory.username
LEFT JOIN item_table ON inventory.item_id = item_table.item_id;

INSERT INTO inventory VALUES ('admin1', 1, 1);
INSERT INTO inventory VALUES ('admin1', 2, 1);
INSERT INTO inventory VALUES ('admin1', 4, 2);
INSERT INTO inventory VALUES ('admin1', 5, 1);
INSERT INTO inventory VALUES ('admin1', 8, 2);
INSERT INTO inventory VALUES ('admin1', 11, 10);

INSERT INTO inventory VALUES ('admin2', 3, 2);
INSERT INTO inventory VALUES ('admin2', 4, 1);
INSERT INTO inventory VALUES ('admin2', 7, 1);
INSERT INTO inventory VALUES ('admin2', 9, 2);
INSERT INTO inventory VALUES ('admin2', 10, 1);
INSERT INTO inventory VALUES ('admin2', 11, 9);

INSERT INTO inventory VALUES ('user1', 2, 1);
INSERT INTO inventory VALUES ('user1', 4, 1);
INSERT INTO inventory VALUES ('user1', 8, 1);

INSERT INTO inventory VALUES ('user2', 1, 1);
INSERT INTO inventory VALUES ('user2', 2, 1);
INSERT INTO inventory VALUES ('user2', 6, 1);
INSERT INTO inventory VALUES ('user2', 11, 3);

INSERT INTO inventory VALUES ('user3', 7, 1);
INSERT INTO inventory VALUES ('user3', 9, 1);

INSERT INTO inventory VALUES ('user4', 1, 1);
INSERT INTO inventory VALUES ('user4', 2, 1);
INSERT INTO inventory VALUES ('user4', 6, 1);
INSERT INTO inventory VALUES ('user4', 8, 1);

INSERT INTO inventory VALUES ('user5', 7, 1);
INSERT INTO inventory VALUES ('user5', 8, 1);
INSERT INTO inventory VALUES ('user5', 10, 1);
INSERT INTO inventory VALUES ('user5', 11, 5);
