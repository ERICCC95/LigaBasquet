package com.example.repository;

import com.example.Model.Equipo;
import com.example.Model.Jugador;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;
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

    public List<Jugador> findByEquipoNombre(String nombre);

    public List<Jugador> findByEquipoNombreAndPosicionCampo(String nombre, String posicion);

    public List<Jugador> findTopByOrderByCanastasTotalesDesc();

    public List<Jugador> findFirst5ByOrderByAsistenciasTotalesDesc();

    @Query("Select j From Jugador j where j.equipo.nombre = :equipoNombre ORDER BY j.canastasTotales DESC")
    List<Jugador> findByEquipoNombreAndTopCanastasTotales(@Param("equipoNombre") String equipoNombre, Pageable pageable);
}
