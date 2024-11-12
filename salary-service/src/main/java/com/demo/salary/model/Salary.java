package com.demo.salary.model;

import org.springframework.data.annotation.Id;

public record Salary(@Id Long id, Long employeeId, double salary) {
}