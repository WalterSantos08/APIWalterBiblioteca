package com.example.walterbiblioteca.mappers;

import com.example.walterbiblioteca.dtos.LivroDto;
import com.example.walterbiblioteca.models.Livro;

public class LivroMapper {

    // Converte de Livro (entidade) para LivroDto
    public static LivroDto toDto(Livro livro) {
        return new LivroDto(
                livro.getId(),
                livro.getTitulo(),
                livro.getAutor(),
                livro.getAnoPublicacao(),
                livro.getGenero(),
                livro.getDescricao()
        );
    }

    // Converte de LivroDto para Livro (entidade)
    public static Livro toEntity(LivroDto dto) {
        Livro livro = new Livro();
        livro.setId(dto.id());
        livro.setTitulo(dto.titulo());
        livro.setAutor(dto.autor());
        livro.setAnoPublicacao(dto.anoPublicacao());
        livro.setGenero(dto.genero());
        livro.setDescricao(dto.descricao());
        return livro;
    }
}
