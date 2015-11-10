package com.example.repository;

import com.example.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by jhipster on 22/10/15.
 */
public interface LigaRepository extends PagingAndSortingRepository<Liga, Long> {

    public List<Liga> findByNombre(String nombre);

}
