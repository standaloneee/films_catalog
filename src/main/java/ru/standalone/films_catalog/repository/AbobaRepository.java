package ru.standalone.films_catalog.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.standalone.films_catalog.entity.Aboba;
import ru.standalone.films_catalog.entity.Biba;

import java.util.List;
import java.util.UUID;

@Repository
public interface AbobaRepository extends JpaRepository<Aboba, UUID> {
List<Aboba> findAbobasByName(String name);
}
