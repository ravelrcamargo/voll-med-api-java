CREATE TABLE usuarios (
    id bigint NOT NULL AUTO_INCREMENT,
    login VARCHAR(100) NOT NULL,
    senha VARCHAR(255) NOT NULL UNIQUE,


    ativo BOOLEAN NOT NULL,

    PRIMARY KEY (id)
);