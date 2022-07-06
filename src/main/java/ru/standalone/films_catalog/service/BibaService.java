package ru.standalone.films_catalog.service;

import org.springframework.stereotype.Service;
import ru.standalone.films_catalog.dto.AbobaDto;
import ru.standalone.films_catalog.dto.BibaDto;
import ru.standalone.films_catalog.repository.AbobaRepository;
import ru.standalone.films_catalog.repository.BibaRepository;

import java.util.List;
@Service
public class BibaService {
    private BibaRepository bibRep;

    public BibaService(BibaRepository bibRep){
        this.bibRep = bibRep;
    }

    public void addBiba(BibaDto bibaDto){
        bibRep.addBiba(bibaDto);
    }
    public List<BibaDto> returnBiba(){
        return bibRep.returnBiba();
    }
}
