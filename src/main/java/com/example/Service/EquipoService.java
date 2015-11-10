package com.example.Service;

import com.example.Model.Equipo;
import com.example.Model.Jugador;
import com.example.Model.Temporada;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import com.example.repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 22/10/15.
 */
@Service
@Transactional
public class EquipoService {

    @Autowired
    EquipoRepository equipoRepository;
    @Autowired
    TemporadaRepository temporadaRepository;

    public void testEquipo() {

        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1999, Calendar.JANUARY, 01);
        Equipo equipo1 = new Equipo("Barca", "Barcelona", calendar.getTime());
        equipoRepository.save(equipo1);
        calendar.set(1995, Calendar.SEPTEMBER, 15);
        Equipo equipo2 = new Equipo("Podemos", "Paris", calendar.getTime());
        equipoRepository.save(equipo2);
        System.out.println(equipoRepository.findByLocalidad("Paris"));

    }
}
