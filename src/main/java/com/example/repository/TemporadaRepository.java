package com.example.repository;

import com.example.Model.Liga;
import com.example.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by jhipster on 22/10/15.
 */
public interface TemporadaRepository extends PagingAndSortingRepository<Temporada, Long> {

    public List<Temporada> findByAnio(int anio);
}
