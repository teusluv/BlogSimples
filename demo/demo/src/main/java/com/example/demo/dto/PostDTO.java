package com.example.demo.dto; 


import jakarta.validation.constraints.NotBlank;

public record PostDTO(
    @NotBlank(message = "Título é obrigatório") String titulo,
    @NotBlank(message = "Conteúdo é obrigatório") String conteudo
) {}