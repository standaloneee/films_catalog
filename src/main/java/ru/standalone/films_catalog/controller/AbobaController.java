package ru.standalone.films_catalog.controller;

import org.springframework.web.bind.annotation.*;
import ru.standalone.films_catalog.entity.Aboba;
import ru.standalone.films_catalog.entity.Biba;
import ru.standalone.films_catalog.service.AbobaService;
import ru.standalone.films_catalog.service.BibaService;

import java.util.List;
import java.util.UUID;

@RestController
public class AbobaController {
    private AbobaService abobaService;

    public AbobaController(AbobaService abb, BibaService bab) {
        abobaService = abb;
    }

    @PostMapping("abobas")
    public String postAboba(@RequestBody Aboba newAbobaDto) {
        abobaService.addAboba(newAbobaDto);
        return "success";
    }

    @PostMapping("abobas/add/{id}/biba/{bibaID}")
    public String addBibaToAboba(@PathVariable(value = "id") UUID id,
                                 @PathVariable(value = "bibaID") UUID bibaID) {

        abobaService.addBibaToAboba(id, bibaID);
        return "success";
    }

    @GetMapping("abobas")
    public List<Aboba> returnAboba() {
        return abobaService.returnAboba();
    }

    @DeleteMapping("abobas")
    public void deleteAbobas() {
        abobaService.deleteAllAbobas();
    }

    @DeleteMapping("abobas/{id}")
    public void deleteAbobaById(@PathVariable(value = "id") UUID id){
        abobaService.deleteAbobaById(id);
    }

    @GetMapping("abobas/{id}")
    public Aboba returnAbobaById(@PathVariable(value = "id") UUID id){
        return abobaService.returnAbobaById(id);
    }

    @GetMapping("abobas/name/{name}")
    public List<Aboba> returnAbobaByName(@PathVariable(value = "name") String name){
        return abobaService.returnAbobaByName(name);
    }


}
