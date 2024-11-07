package com.demo.employee.model;

import org.springframework.data.annotation.Id;

public record Employee(@Id Long id, String fullName, double salary) {
}
