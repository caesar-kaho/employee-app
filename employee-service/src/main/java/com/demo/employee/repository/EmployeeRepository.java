package com.demo.employee.repository;

import com.demo.employee.model.Employee;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface EmployeeRepository extends R2dbcRepository<Employee, Long> {
}
