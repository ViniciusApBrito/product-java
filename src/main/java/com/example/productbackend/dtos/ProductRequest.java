package com.example.productbackend.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record ProductRequest(
    
    @NotBlank(message = "Mensagem não pode ser em branco!")
    String name,

    @Min(value = 0, message = "Valor mínimo para o produto é 0")
    double price
) {
    
}