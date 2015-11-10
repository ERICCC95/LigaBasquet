package com.example.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Temporada {


    @Column
    int anio;
    @ManyToOne
    Liga liga;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @ManyToMany
    private Set<Equipo> equipos = new HashSet<>();

    public Temporada(int anio) {
        this.anio = anio;

    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", anio=" + anio +
                ", equipos=" + equipos +
                '}';
    }
}
