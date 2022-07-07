package ru.standalone.films_catalog.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.springframework.data.annotation.Reference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aboba_id", referencedColumnName = "id")
    private Aboba aboba;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        Biba history = (Biba) o;
        return getId() != null && Objects.equals(getId(), history.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }



}


