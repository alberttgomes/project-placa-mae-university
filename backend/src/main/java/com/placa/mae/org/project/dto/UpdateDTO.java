package com.placa.mae.org.project.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateDTO {
    private int age;
    private String email;
    private String username;
    private String password;
}
