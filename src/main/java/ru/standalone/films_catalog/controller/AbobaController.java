package ru.standalone.films_catalog.controller;

import org.springframework.web.bind.annotation.*;
import ru.standalone.films_catalog.dto.AbobaDto;
import ru.standalone.films_catalog.entity.Aboba;
import ru.standalone.films_catalog.service.AbobaService;

import java.util.List;
import java.util.UUID;

@RestController
public class AbobaController {
    private AbobaService abobush;

    public AbobaController(AbobaService abb) {
        abobush = abb;
    }

    @PostMapping("abobas")
    public String getAboba(@RequestBody Aboba newAbobaDto) {

        abobush.addAboba(newAbobaDto);
        return "success";
    }

    @GetMapping("abobas")
    public List<Aboba> returnAboba() {
        return abobush.returnAboba();
    }

    @DeleteMapping("abobas")
    public void deleteAbobas() {
        abobush.deleteAllAbobas();
    }
    @DeleteMapping("abobas/{id}")
    public void deleteAbobaById(@PathVariable(value = "id") UUID id){
        abobush.deleteAbobaById(id);
    }
    @GetMapping("abobas/{id}")
    public Aboba returnAbobaById(@PathVariable(value = "id") UUID id){
        return abobush.returnAbobaById(id);
    }

}
