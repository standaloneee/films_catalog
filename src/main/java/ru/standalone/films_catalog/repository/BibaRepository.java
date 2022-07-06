package ru.standalone.films_catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.standalone.films_catalog.entity.Biba;

import java.util.UUID;

@Repository
public interface BibaRepository extends JpaRepository<Biba, UUID> {

}
