CREATE TABLE IF NOT EXISTS salary (
                                      id SERIAL PRIMARY KEY,
                                      employee_id BIGINT NOT Null,
                                      salary float8 NOT NULL
);

-- Generate 100 dummy salary records
INSERT INTO salary (employee_id, salary)
SELECT
    -- Generate sequential employee IDs from 1000 to 1099
    1000 + series.i as employee_id,
    -- Generate random salaries between 40000 and 120000 with 2 decimal places
    ROUND(CAST(RANDOM() * (120000 - 40000) + 40000 AS numeric), 2) as salary
FROM
    generate_series(0, 99) as series(i);

-- Alternative version using VALUES for a smaller dataset
INSERT INTO salary (employee_id, salary) VALUES
                                             (1001, 45000.00),
                                             (1002, 52500.50),
                                             (1003, 63000.75),
                                             (1004, 78900.25),
                                             (1005, 92000.00),
                                             (1006, 105000.50),
                                             (1007, 48500.75),
                                             (1008, 67800.25),
                                             (1009, 83500.00),
                                             (1010, 95600.50);