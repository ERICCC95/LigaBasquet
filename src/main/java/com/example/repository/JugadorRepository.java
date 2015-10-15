package com.example.repository;

import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by jhipster on 8/10/15.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador,Long>{

    public List<Jugador> findBynombreLike(String nombre);
    public List<Jugador> findBycanastasTotalesGreaterThanEqual(int canastas);
    public List<Jugador> findByasistenciasTotalesBetween(int minCanasta, int maxCanasta);
    public List <Jugador> findByposicionCampo (String posicion);
    public List <Jugador> findByFechaNacimientoLessThan(Date fecha);
    public List <Jugador> findBycanastasTotalesGreaterThanEqualAndFechaNacimientoLessThan(int canasta,Date fecha);
}
