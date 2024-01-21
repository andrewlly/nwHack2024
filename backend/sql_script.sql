CREATE TABLE user (
 uid bigint PRIMARY KEY AUTO_INCREMENT,
 user_name VARCHAR(30) NOT NULL,
 phone_number VARCHAR(15) UNIQUE NOT NULL,
 password VARCHAR(64) NOT NULL,
 email VARCHAR(50) UNIQUE NOT NULL,
 avatar_url VARCHAR(255),
 latest_login DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
 creation_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP, 
 bio VARCHAR(300) DEFAULT NULL,    -- New field for user biography
 user_level TINYINT NOT NULL DEFAULT 0 , -- New field for user level/status
 is_deleted TINYINT NOT NULL DEFAULT 0
);


CREATE TABLE plants (
   PlantID bigint AUTO_INCREMENT PRIMARY KEY,
   PlantName VARCHAR(100),
   PlantDescription TEXT,
   CareLevel INT,
   SuitableClimate VARCHAR(100),
   SuitableSeason VARCHAR(100),
   HarvestTime INT,  -- Number of days to harvest
   PlantGraphicURL VARCHAR(255),  -- URL to a graphic representation of the plant
   is_deleted TINYINT NOT NULL DEFAULT 0
);



CREATE TABLE user_plant (
   UserPlantID bigint AUTO_INCREMENT PRIMARY KEY,
   UserPlantName VARCHAR(30) NOT NULL,
   UserID INT,
   PlantID INT,
   StageID INT,
   Quantity INT,
   DatePlanted DATE,
   DateLeft INT, 
   CurrentCondition VARCHAR(100),
   is_deleted TINYINT NOT NULL DEFAULT 0
);


CREATE TABLE plant_stages (
   StageID bigint AUTO_INCREMENT PRIMARY KEY,
   PlantID INT,
   StageName VARCHAR(100),
   StageDescription TEXT,
   StageStartDay INT, -- The day count from planting when this stage begins
   StageEndDay INT,   -- The day count from planting when this stage ends
   StageTips TEXT,
   StageImageURL VARCHAR(255), -- URL to an image representing this stage
   is_deleted TINYINT NOT NULL DEFAULT 0
);






CREATE TABLE user_tasks (
   UserTasksID bigint AUTO_INCREMENT PRIMARY KEY,
   PlantCareTaskID INT,
   UserPlantID INT,
   Completed INT,
   TaskCompletedNotes TEXT,
   is_deleted TINYINT NOT NULL DEFAULT 0
);

CREATE TABLE plant_care_task (
   PlantCareTaskID bigint AUTO_INCREMENT PRIMARY KEY,
   PlantCareTaskName VARCHAR(30),
   PlantID INT,
   StageID INT,
   DayOffset INT,
   InstructionType INT,
   Instructions TEXT,
   is_deleted TINYINT NOT NULL DEFAULT 0
);




CREATE TABLE `sys_menu` (
 id bigint NOT NULL AUTO_INCREMENT,
 menu_name varchar(64) NOT NULL,
 path varchar(200) DEFAULT NULL,
 component varchar(255) DEFAULT NULL,
 visible char(1) DEFAULT '0',
 status char(1) DEFAULT '0',
 perms varchar(100) DEFAULT NULL,
 icon varchar(100) DEFAULT '#',
 del_flag tinyint DEFAULT '0',
 PRIMARY KEY (id)
);




CREATE TABLE sys_role (
 id bigint NOT NULL AUTO_INCREMENT,
 role_label varchar(255) DEFAULT NULL,
 role_name varchar(255) DEFAULT NULL,
 status char(1) DEFAULT '0',
 del_flag int(1) DEFAULT '0',
 PRIMARY KEY (id)
);


CREATE TABLE sys_role_menu (
 id bigint NOT NULL AUTO_INCREMENT,
 role_id bigint(20) NOT NULL,
 menu_id bigint(20) NOT NULL,
 PRIMARY KEY (id)
);


CREATE TABLE sys_user_role (
 id bigint NOT NULL AUTO_INCREMENT,
 user_id bigint(20) NOT NULL,
 role_id bigint(20) NOT NULL,
 PRIMARY KEY (id)
);
