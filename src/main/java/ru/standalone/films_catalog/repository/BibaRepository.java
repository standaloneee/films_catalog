package ru.standalone.films_catalog.repository;

import org.springframework.stereotype.Repository;
import ru.standalone.films_catalog.dto.AbobaDto;
import ru.standalone.films_catalog.dto.BibaDto;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BibaRepository {
    private List<BibaDto> bibList;

    public BibaRepository(){
        bibList = new ArrayList<>();
    }

    public List<BibaDto> getBibList(){
        return bibList;
    }

    public void addBiba(BibaDto newBib){
        bibList.add(newBib);
    }
    public List<BibaDto> returnBiba(){
        return bibList;
    }
}
