CREATE TABLE CARS(
    Id BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    Brand VARCHAR2(100) NOT NULL ,
    Model VARCHAR2(100) NOT NULL ,
    Generation VARCHAR2(100) NOT NULL ,
    Motor_Capacity NUMBER(5) NOT NULL ,
    Motor_code VARCHAR2(100),
    Fuel_Type VARCHAR2(8)
        CHECK (Fuel_Type = 'diesel' OR
               Fuel_Type = 'gasoline' OR
               Fuel_Type = 'lpg' OR
               Fuel_Type = 'hybrid' OR
               Fuel_Type = 'electric') NOT NULL ,
    Lifting BOOLEAN NOT NULL,
    Production_year NUMBER(4) NOT NULL
);

CREATE TABLE USERS(
    Id BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    Name VARCHAR2(100),
    Surname VARCHAR2(100),
    Email VARCHAR2(100),
    Phone_num NUMBER(9)
);

CREATE TABLE TUTORIALS(
    Id BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    Car_id BIGINT REFERENCES CARS(Id),
    PDF_link VARCHAR2(2000),
    Name VARCHAR(2000)
);
