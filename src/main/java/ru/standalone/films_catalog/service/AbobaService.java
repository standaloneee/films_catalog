package ru.standalone.films_catalog.service;

import liquibase.pro.packaged.C;
import org.springframework.stereotype.Service;
import ru.standalone.films_catalog.controller.AbobaController;
import ru.standalone.films_catalog.dto.AbobaDto;
import ru.standalone.films_catalog.entity.Aboba;
import ru.standalone.films_catalog.entity.Biba;
import ru.standalone.films_catalog.repository.AbobaRepository;

import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
public class AbobaService {

    private AbobaRepository abbRep;

    public AbobaService(AbobaRepository abbRep) {
        this.abbRep = abbRep;
    }

    public void addAboba(Aboba aboba) {
        aboba.setId(UUID.randomUUID());
        abbRep.save(aboba);
//        abbRep.addAboba(abobaDto);
    }

    public List<Aboba> returnAboba() {
        return abbRep.findAll();
    }
    public void deleteAllAbobas(){
        abbRep.deleteAll();
    }
    public void deleteAbobaById(UUID id){
        abbRep.deleteById(id);
    }
    public Aboba returnAbobaById(UUID id) {
        return abbRep.findById(id).get();
    }

    public List<Aboba> returnAbobaByName(String name) {
        return abbRep.findAbobasByName(name);
    }
    public void addBibaToAboba(UUID id, Biba biba){
        Aboba aboba = abbRep.findById(id).get();
        aboba.addBibaToAboba(biba);
        abbRep.save(aboba);

    }
}
