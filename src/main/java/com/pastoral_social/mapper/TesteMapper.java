package com.pastoral_social.mapper;

import com.pastoral_social.dto.TesteDTO;
import com.pastoral_social.entity.Teste;

public class TesteMapper {

    public static TesteDTO toDTO(Teste entity) {
        TesteDTO dto = new TesteDTO();
        dto.setNome(entity.getNome());
        return dto;
    }

    public static Teste toEntity(TesteDTO dto) {
        Teste entity = new Teste();
        entity.setNome(dto.getNome());
        return entity;
    }

}
