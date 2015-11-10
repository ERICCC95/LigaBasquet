package com.example.repository;

import com.example.Model.Equipo;
import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by jhipster on 22/10/15.
 */
public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long> {

    public List<Equipo> findBynombre(String nombre);

    public List<Equipo> findByLocalidad(String localidad);
}


