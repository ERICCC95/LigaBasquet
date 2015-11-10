package com.example.Service;

import com.example.Model.Liga;
import com.example.Model.Temporada;
import com.example.repository.EquipoRepository;
import com.example.repository.LigaRepository;
import com.example.repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by jhipster on 22/10/15.
 */
@Service
@Transactional
public class LigaService {

    @Autowired
    TemporadaRepository temporadaRepository;
    @Autowired
    LigaRepository ligaRepository;

    public void testLiga() {

        Liga liga1 = new Liga("UEFA");
        ligaRepository.save(liga1);


    }
}
