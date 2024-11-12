package com.demo.salary.repository;

import com.demo.salary.model.Salary;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface SalaryRepository extends R2dbcRepository<Salary, Long> {
    Mono<Salary> findByEmployeeId(Long employeeId);
}
