package com.example.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 20/10/15.
 */
@Entity
public class Equipo {
    @OneToMany(mappedBy = "equipo")
    Set<Jugador> jugadores = new HashSet<>();
    @Column
    String nombre;
    @Column
    String localidad;
    @Column
    Date fecha;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @ManyToMany(mappedBy = "equipos")
    private Set<Temporada> temporadas = new HashSet<>();

    public Equipo() {
    }

    public Equipo(String nombre, String localidad, Date fecha) {

        this.nombre = nombre;
        this.localidad = localidad;
        this.fecha = fecha;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
