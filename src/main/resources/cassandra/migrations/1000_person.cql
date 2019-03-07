CREATE KEYSPACE IF NOT EXISTS sample WITH REPLICATION = {'class':'SimpleStrategy', 'replication_factor':1};

CREATE TABLE IF NOT EXISTS person (
       id bigint,
       name text,
       age bigint,
       PRIMARY KEY (id)
);


USE sample;
