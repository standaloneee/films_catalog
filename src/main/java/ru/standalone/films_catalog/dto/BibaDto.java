package ru.standalone.films_catalog.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class BibaDto {
    private String bibaName;
    private int age;
    public boolean woman;
}
