package ru.standalone.films_catalog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.standalone.films_catalog.dto.AbobaDto;
import ru.standalone.films_catalog.dto.BibaDto;
import ru.standalone.films_catalog.service.AbobaService;
import ru.standalone.films_catalog.service.BibaService;

import java.util.List;

@RestController
public class BibaController {

    private BibaService bibish;

    public BibaController(BibaService biba){
        bibish = biba;
    }

    @PostMapping("sendBibas")
    public String getBiba(@RequestBody BibaDto newBibaDto) {

        bibish.addBiba(newBibaDto);
        return "success";
    }

    @GetMapping("getBibas")
    public List<BibaDto> returnAboba(){
        return bibish.returnBiba();
    }
}
