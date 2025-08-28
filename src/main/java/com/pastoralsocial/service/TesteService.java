package com.pastoralsocial.service;

import org.springframework.stereotype.Service;

import com.pastoralsocial.dto.TesteDTO;
import com.pastoralsocial.exception.TesteException;
import com.pastoralsocial.mapper.TesteMapper;
import com.pastoralsocial.repository.TesteRepository;
import com.pastoralsocial.security.TesteSecurity;
import com.pastoralsocial.util.TesteUtil;

@Service
public class TesteService {

    // Simula o repositório @Autowired
    TesteRepository repository = new TesteRepository();
    TesteSecurity security = new TesteSecurity();
    TesteException exception = new TesteException();

    public TesteDTO createTeste(TesteDTO testeDTO) {
        testeDTO.setNome(testeDTO.getNome() + "| Service: OK");
        testeDTO.setNome(testeDTO.getNome() + "| " + TesteUtil.formatarNome("OK"));

        if (security.teste()) {
            testeDTO.setNome(testeDTO.getNome() + "| Security: OK");
        }

        try {
            int resultado = 1 / 0; // força ArithmeticException
            System.out.println(resultado);
        } catch (Exception e) {
            testeDTO.setNome(testeDTO.getNome() + "| Exception: OK");
        }

        // Simula a persistência do entity

        return TesteMapper.toDTO(repository.Gravar(TesteMapper.toEntity(testeDTO)));
    }

}
