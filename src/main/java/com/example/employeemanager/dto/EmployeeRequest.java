package com.example.employeemanager.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EmployeeRequest {
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
}
