package ru.standalone.films_catalog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.standalone.films_catalog.dto.AbobaDto;
import ru.standalone.films_catalog.dto.BibaDto;
import ru.standalone.films_catalog.entity.Biba;
import ru.standalone.films_catalog.service.AbobaService;
import ru.standalone.films_catalog.service.BibaService;

import java.util.List;

@RestController
public class BibaController {

    private BibaService bibish;

    public BibaController(BibaService biba){
        bibish = biba;
    }

    @PostMapping("bibas")
    public final String postBiba(@RequestBody Biba newBibaDto) {

        bibish.addBiba(newBibaDto);
        return "success";
    }

    @GetMapping("bibas")
    public List<Biba> returnAboba(){
        return bibish.returnBiba();
    }
}
