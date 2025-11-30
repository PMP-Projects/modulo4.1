package br.com.fatec.modulo4_consumer1.core.domain;

import java.time.LocalDate;

public record Pessoa(
        String nome,
        LocalDate dataNascimento
) {
}