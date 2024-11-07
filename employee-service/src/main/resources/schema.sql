-- Create table if not exists
CREATE TABLE IF NOT EXISTS employee (
                                        id SERIAL PRIMARY KEY,
                                        full_name VARCHAR(255) NOT NULL,
    salary float8 NOT NULL
    );

-- Insert dummy data if table is empty
INSERT INTO employee (full_name, salary)
SELECT * FROM (
                  VALUES
                      ('John Smith', 65000.00),
                      ('Mary Johnson', 72000.50),
                      ('Robert Williams', 58000.75),
                      ('Patricia Brown', 81500.25),
                      ('Michael Davis', 67800.00),
                      ('Jennifer Garcia', 92000.50),
                      ('William Anderson', 63400.75),
                      ('Elizabeth Thomas', 78900.25),
                      ('David Martinez', 69500.00),
                      ('Sarah Robinson', 84600.50),
                      ('Joseph Taylor', 71200.75),
                      ('Jessica White', 88700.25),
                      ('Charles Lee', 66900.00),
                      ('Margaret Wilson', 93500.50),
                      ('Richard Moore', 76300.75)
              ) AS v (full_name, salary)
WHERE NOT EXISTS (SELECT 1 FROM employee LIMIT 1);