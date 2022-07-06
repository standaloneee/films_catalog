package ru.standalone.films_catalog.repository;


import org.springframework.stereotype.Repository;
import ru.standalone.films_catalog.dto.AbobaDto;
import ru.standalone.films_catalog.service.AbobaService;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AbobaRepository {
    private List<AbobaDto> abbList;

    public AbobaRepository(){
        abbList = new ArrayList<>();
    }

    public List<AbobaDto> getAboba(){
        return abbList;
    }

    public void addAboba(AbobaDto newAbob){
        abbList.add(newAbob);
    }
    public List<AbobaDto> returnAboba(){
        return abbList;
    }
}
