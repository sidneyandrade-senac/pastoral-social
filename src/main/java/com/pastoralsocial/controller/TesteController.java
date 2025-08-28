package com.pastoralsocial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pastoralsocial.dto.TesteDTO;
import com.pastoralsocial.service.TesteService;

@RestController
@RequestMapping("/api/teste")
public class TesteController {

    //simula o @Autowired
    private TesteService service = new TesteService();

    @RequestMapping
    public TesteDTO teste() {
        //simula o @RequestBody
        TesteDTO testedDto = new TesteDTO();
        testedDto.setNome("Controller e DTO : OK");
        return service.createTeste(testedDto);
    }

}
