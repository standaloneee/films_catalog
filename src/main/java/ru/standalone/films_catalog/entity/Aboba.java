package ru.standalone.films_catalog.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "aboba")
@NoArgsConstructor
@Getter
@Setter
public class Aboba{

    @Id
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "aboba_id")
    private Set<Biba> bibaList = new HashSet<>();

    public void addBibaToAboba(Biba biba) {
        bibaList.add(biba);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        Aboba history = (Aboba) o;
        return getId() != null && Objects.equals(getId(), history.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}


