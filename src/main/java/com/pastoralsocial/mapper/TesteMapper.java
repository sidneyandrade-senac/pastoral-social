package com.pastoralsocial.mapper;

import com.pastoralsocial.dto.TesteDTO;
import com.pastoralsocial.entity.Teste;

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
