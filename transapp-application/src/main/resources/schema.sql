CREATE TABLE IF NOT EXISTS TRANSACTIONS (
  id VARCHAR(50),
  insertionTime BIGINT,
  amount DECIMAL,
PRIMARY KEY (id)
);

CREATE VIEW IF NOT EXISTS LAST_60_SECONDS_TRANSACTIONS AS
  SELECT * FROM TRANSACTIONS
  WHERE DATEADD('MILLISECOND', insertionTime + 60000, (select timestamp '1970-01-01 00:00:00.000+00')) > CURRENT_TIMESTAMP()
;

CREATE VIEW IF NOT EXISTS STATISTICS AS
  SELECT
    SUM(AMOUNT) AS sum,
    AVG(AMOUNT) AS avg,
    MAX(AMOUNT) AS max,
    MIN(AMOUNT) AS min,
    count(*) AS count
  FROM LAST_60_SECONDS_TRANSACTIONS
;
