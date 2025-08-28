package com.pastoral_social.repository;

import com.pastoral_social.entity.Teste;

public class TesteRepository {

    //simula o JPA
    public Teste Gravar(Teste entity) {
        entity.setNome(entity.getNome() + "| Repository: OK");
        return entity;
    }

}
