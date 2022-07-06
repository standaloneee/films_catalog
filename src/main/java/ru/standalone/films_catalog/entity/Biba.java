package ru.standalone.films_catalog.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;


@Entity
@Table(name = "biba")
@NoArgsConstructor
@Getter
@Setter
public class Biba{

    @Id
    private UUID id;

    @Column(name = "biba_name")
    private String bibaName;

    @Column(name = "age")
    private int age;

    @Column(name = "woman")
    private boolean woman;



}


