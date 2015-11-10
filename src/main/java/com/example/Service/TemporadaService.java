package com.example.Service;

import com.example.Model.Equipo;
import com.example.Model.Liga;
import com.example.Model.Temporada;
import com.example.repository.EquipoRepository;
import com.example.repository.LigaRepository;
import com.example.repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
@Transactional
public class TemporadaService {
    @Autowired
    TemporadaRepository temporadaRepository;
    @Autowired
    EquipoRepository equipoRepository;
    @Autowired
    LigaRepository ligaRepository;

    public void testTemporada() {

        Temporada temporada1 = new Temporada(1998);
        Liga liga1 = ligaRepository.findByNombre("UEFA").get(0);
        Equipo equipo1 = equipoRepository.findBynombre("Barca").get(0);

        ligaRepository.save(liga1);
        temporada1.setLiga(liga1);
        temporada1.getEquipos().add(equipo1);
        temporadaRepository.save(temporada1);

        Temporada temporada2 = new Temporada(1999);

        Equipo equipo2 = equipoRepository.findBynombre("Podemos").get(0);
        ligaRepository.save(liga1);
        temporada2.setLiga(liga1);
        temporada2.getEquipos().add(equipo2);
        temporadaRepository.save(temporada2);

    }
}
