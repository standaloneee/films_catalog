package ru.standalone.films_catalog.service;

import org.springframework.stereotype.Service;
import ru.standalone.films_catalog.controller.AbobaController;
import ru.standalone.films_catalog.dto.AbobaDto;
import ru.standalone.films_catalog.repository.AbobaRepository;

import java.util.List;
import java.util.Locale;


@Service
public class AbobaService {

    private AbobaRepository abbRep;

    public AbobaService(AbobaRepository abbRep){
        this.abbRep = abbRep;
    }

    public void addAboba(AbobaDto abobaDto){
       abbRep.addAboba(abobaDto);
    }
    public List<AbobaDto> returnAboba(){
        return abbRep.returnAboba();
    }
}
