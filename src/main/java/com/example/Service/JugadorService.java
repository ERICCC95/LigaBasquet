package com.example.Service;

import com.example.Model.Jugador;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Created by jhipster on 8/10/15.
 */
@Service
@Transactional
public class JugadorService {

@Autowired
JugadorRepository jugadorRepository;

    public void testJugador(){
        Calendar calendar = GregorianCalendar.getInstance();

        calendar.set(1999, Calendar.JANUARY, 01);
        Jugador jugador1 = new Jugador("Alex",calendar.getTime(), 99, 50, 0, "Alero");
        calendar.set(1995, Calendar.SEPTEMBER, 15);
        Jugador jugador2 = new Jugador("Eric", calendar.getTime(), 20, 30, 5, "Base");
        calendar.set(1999, Calendar.AUGUST, 01);
        Jugador jugador3 = new Jugador("Joquim", calendar.getTime(), 150, 90, 54, "Pivot");
        calendar.set(1950, Calendar.APRIL, 03);
        Jugador jugador4 = new Jugador("Jaime", calendar.getTime(), 120, 55, 100, "Alero");
        System.out.println(jugadorRepository.findBynombreLike("Alex"));
        System.out.println(jugadorRepository.findByposicionCampo("Pivot"));
        calendar.set(1999, Calendar.APRIL, 06);
        System.out.println(jugadorRepository.findByFechaNacimientoLessThan(calendar.getTime()));
        System.out.println(jugadorRepository.findByasistenciasTotalesBetween(0, 50));
        System.out.println(jugadorRepository.findBycanastasTotalesGreaterThanEqual(50));
        System.out.println(jugadorRepository.findBycanastasTotalesGreaterThanEqualAndFechaNacimientoLessThan(10, calendar.getTime()));

    }


}

