package com.example.demo.dtos;


public record LancheDTO(
        String nome,
        String descricao,
        SaborDTO sabor,
        Double preco
) {}