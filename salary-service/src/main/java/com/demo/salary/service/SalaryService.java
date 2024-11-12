package com.demo.salary.service;

import com.demo.salary.model.Salary;
import com.demo.salary.repository.SalaryRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SalaryService {
    private final SalaryRepository salaryRepository;

    public SalaryService(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }

    public Mono<Salary> findEmployeeById(Long employeeId) {
        return salaryRepository.findByEmployeeId(employeeId)
                .switchIfEmpty(Mono.error(() -> new RuntimeException("Employee not found!")));
    }

    public Mono<Salary> saveSalary(Salary salary) {
        return salaryRepository.save(salary);
    }
}
