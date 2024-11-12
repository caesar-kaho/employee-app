package com.demo.salary.controller;

import com.demo.salary.model.Salary;
import com.demo.salary.service.SalaryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/salaries")
public class SalaryController {

    private final SalaryService salaryService;

    public SalaryController(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @GetMapping("/employee/{employeeId}")
    public Mono<Salary> getSalariesByEmployeeId(@PathVariable Long employeeId) {
        return salaryService.findEmployeeById(employeeId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Salary> createSalary(@RequestBody Salary salary) {
        return salaryService.saveSalary(salary);
    }
}