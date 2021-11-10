DROP TABLE IF EXISTS item_table;

CREATE TABLE item_table (
	item_id INT NOT NULL AUTO_INCREMENT,
    item_name VARCHAR(45) NOT NULL,
    item_description VARCHAR(100) NOT NULL,
    PRIMARY KEY(item_id)
);


INSERT INTO item_table (item_name, item_description) VALUES ('Microsoft Office', 'contains: Word, Excel, PowerPoint');
INSERT INTO item_table (item_name, item_description) VALUES ('Windows 10 License', '');
INSERT INTO item_table (item_name, item_description) VALUES ('WinRAR License', '');
INSERT INTO item_table (item_name, item_description) VALUES ('HP Laptop', 'model: Chromebook x360');
INSERT INTO item_table (item_name, item_description) VALUES ('HP Printer', 'model: HP Laserjet 1018');
INSERT INTO item_table (item_name, item_description) VALUES ('Dell Laptop', 'model: Vostro 5502');
INSERT INTO item_table (item_name, item_description) VALUES ('Apple Laptop', 'model: MacBook Air');
INSERT INTO item_table (item_name, item_description) VALUES ('HAMA Mouse', 'model: Wireless HAMA MW-110');
INSERT INTO item_table (item_name, item_description) VALUES ('Logitech Mouse', 'model: Wireless Logitech M185');
INSERT INTO item_table (item_name, item_description) VALUES ('EPSON Printer', 'model: EPSON Inkjet L810 CISS');
INSERT INTO item_table (item_name, item_description) VALUES ('Paper Stack', '');
