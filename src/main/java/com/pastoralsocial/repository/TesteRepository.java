package com.pastoralsocial.repository;

import com.pastoralsocial.entity.Teste;

public class TesteRepository {

    //simula o JPA
    public Teste Gravar(Teste entity) {
        entity.setNome(entity.getNome() + "| Repository: OK");
        return entity;
    }

}
