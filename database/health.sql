create DATABASE healthConnect;
USE healthConnect;
CREATE TABLE Request
(
    `RID`       varchar(255),
    `Date`      varchar(255),
    `PUsername` varchar(255),
    `DUsername` varchar(255),
    `Status`    varchar(255)
);

CREATE TABLE Message
(
    RID       varchar(255),
    TIMESTAMP varchar(255),
    DUsername varchar(255),
    Message   varchar(255)
);

USE healthConnect;
DROP TABLE PATIENT, DOCTOR;
CREATE TABLE Patient
(
    Username varchar(255),
    Password  varchar(255),
    RID       varchar(255),
    Type      varchar(255)
);
CREATE TABLE Doctor
(
    Username varchar(255),
    Password  varchar(255),
    RID       varchar(255),
    Type      varchar(255)
);
Insert into Doctor(Username, Password, RID, Type) Values ('nick','nick', 123, 'doctor');
Insert into Patient(Username, Password, RID, Type) Values ('nick','nick', 123, 'patient');

