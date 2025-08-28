package com.pastoral_social.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pastoral_social.dto.TesteDTO;
import com.pastoral_social.service.TesteService;

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
