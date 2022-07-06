package ru.standalone.films_catalog.controller;

import org.springframework.web.bind.annotation.*;
import ru.standalone.films_catalog.dto.AbobaDto;
import ru.standalone.films_catalog.service.AbobaService;

import java.util.List;

@RestController
public class AbobaController {
    private AbobaService abobush;

    public AbobaController(AbobaService abb){
        abobush = abb;
    }

    @PostMapping("idk")
    public String getAboba(@RequestBody AbobaDto newAbobaDto) {

        abobush.addAboba(newAbobaDto);
        return "success";
    }

    @GetMapping("getAbobas")
    public List<AbobaDto> returnAboba(){
       return abobush.returnAboba();
    }


}
