package ru.standalone.films_catalog.service;

import org.springframework.stereotype.Service;
import ru.standalone.films_catalog.entity.Biba;
import ru.standalone.films_catalog.repository.BibaRepository;

import java.util.List;
import java.util.UUID;

@Service
public class BibaService {
    private BibaRepository bibRep;

    public BibaService(BibaRepository bibRep){
        this.bibRep = bibRep;
    }

    public Biba addBiba(Biba bibaDto){
        bibaDto.setId(UUID.randomUUID());
        bibRep.save(bibaDto);
        return bibaDto;
    }
    public Biba returnBibaById(UUID id) {
        return bibRep.findById(id).get();
    }
    public List<Biba> returnBiba(){
        return bibRep.findAll();
    }
}
