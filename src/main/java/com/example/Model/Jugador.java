package com.example.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 8/10/15.
 */

@Entity
public class Jugador {
    @ManyToOne
    Equipo equipo;
    @Column
    String nombre;
    @Column
    Date fechaNacimiento;
    @Column
    int canastasTotales;
    @Column
    int asistenciasTotales;
    @Column
    int rebotesTotales;
    @Column
    String posicionCampo;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    public Jugador(Equipo equipo, String nombre, Date fechaNacimiento, int canastasTotales, int asistenciasTotales, int rebotesTotales, String posicionCampo) {
        this.equipo = equipo;
        this.nombre=nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.canastasTotales = canastasTotales;
        this.asistenciasTotales = asistenciasTotales;
        this.rebotesTotales = rebotesTotales;
        this.posicionCampo = posicionCampo;

    }

    public int getRebotesTotales() {
        return rebotesTotales;
    }

    public void setRebotesTotales(int rebotesTotales) {
        this.rebotesTotales = rebotesTotales;
    }

    public String getPosicionCampo() {
        return posicionCampo;
    }

    public void setPosicionCampo(String posicionCampo) {
        this.posicionCampo = posicionCampo;
    }

    public int getAsistenciasTotales() {
        return asistenciasTotales;
    }

    public void setAsistenciasTotales(int asistenciasTotales) {
        this.asistenciasTotales = asistenciasTotales;
    }

    public int getCanastasTotales() {
        return canastasTotales;
    }

    public void setCanastasTotales(int canastasTotales) {
        this.canastasTotales = canastasTotales;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", equipo=" + equipo +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", canastasTotales=" + canastasTotales +
                ", asistenciasTotales=" + asistenciasTotales +
                ", rebotesTotales=" + rebotesTotales +
                ", posicionCampo='" + posicionCampo + '\'' +
                '}';
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
