package com.example.Service;

import com.example.Model.Equipo;
import com.example.Model.Jugador;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;

/**
 * Created by jhipster on 8/10/15.
 */
@Service
@Transactional
public class JugadorService {

@Autowired
JugadorRepository jugadorRepository;
    @Autowired
    EquipoRepository equipoRepository;
    public void testJugador(){
        Calendar calendar = GregorianCalendar.getInstance();
        Equipo equipo = equipoRepository.findBynombre("Barca").get(0);
        Equipo equipo2 = equipoRepository.findBynombre("Podemos").get(0);
        calendar.set(1999, Calendar.JANUARY, 01);
        Jugador jugador1 = new Jugador(equipo, "Alex", calendar.getTime(), 99, 50, 0, "Alero");
        jugadorRepository.save(jugador1);
        calendar.set(1995, Calendar.SEPTEMBER, 15);

        Jugador jugador2 = new Jugador(equipo, "Eric", calendar.getTime(), 20, 30, 5, "Base");
        jugadorRepository.save(jugador2);
        calendar.set(1999, Calendar.AUGUST, 01);
        Jugador jugador3 = new Jugador(equipo, "Joquim", calendar.getTime(), 150, 90, 54, "Pivot");
        jugadorRepository.save(jugador3);
        calendar.set(1950, Calendar.APRIL, 03);
        Jugador jugador4 = new Jugador(equipo, "Jaime", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador4);
        Jugador jugador5 = new Jugador(equipo, "Alex2", calendar.getTime(), 99, 50, 0, "Alero");
        jugadorRepository.save(jugador5);
        calendar.set(1995, Calendar.SEPTEMBER, 15);

        Jugador jugador6 = new Jugador(equipo, "Eric2", calendar.getTime(), 20, 30, 5, "Base");
        jugadorRepository.save(jugador6);
        calendar.set(1999, Calendar.AUGUST, 01);
        Jugador jugador7 = new Jugador(equipo, "Joquim2", calendar.getTime(), 150, 90, 54, "Pivot");
        jugadorRepository.save(jugador7);
        calendar.set(1950, Calendar.APRIL, 03);
        Jugador jugador8 = new Jugador(equipo, "Jaime2", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador8);
        Jugador jugador9 = new Jugador(equipo, "Joquim3", calendar.getTime(), 150, 90, 54, "Pivot");
        jugadorRepository.save(jugador9);
        calendar.set(1950, Calendar.APRIL, 03);
        Jugador jugador10 = new Jugador(equipo, "Jaime3", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador10);
        Jugador jugador11 = new Jugador(equipo2, "pablo1", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador11);
        Jugador jugador12 = new Jugador(equipo2, "pablo2", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador12);
        Jugador jugador13 = new Jugador(equipo2, "pablo3", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador13);
        Jugador jugador14 = new Jugador(equipo2, "pablo4", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador14);
        Jugador jugador15 = new Jugador(equipo2, "pablo5", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador15);
        Jugador jugador16 = new Jugador(equipo2, "pablo6", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador16);
        Jugador jugador17 = new Jugador(equipo2, "pablo7", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador17);
        Jugador jugador18 = new Jugador(equipo2, "pablo8", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador18);
        Jugador jugador19 = new Jugador(equipo2, "pablo9", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador19);
        Jugador jugador20 = new Jugador(equipo2, "pablo10", calendar.getTime(), 120, 55, 100, "Alero");
        jugadorRepository.save(jugador20);
        System.out.println(jugadorRepository.findBynombreLike("Alex"));
        System.out.println(jugadorRepository.findByposicionCampo("Pivot"));
        calendar.set(1999, Calendar.APRIL, 06);
        System.out.println(jugadorRepository.findByFechaNacimientoLessThan(calendar.getTime()));
        System.out.println(jugadorRepository.findByasistenciasTotalesBetween(0, 50));
        System.out.println(jugadorRepository.findBycanastasTotalesGreaterThanEqual(50));
        System.out.println(jugadorRepository.findBycanastasTotalesGreaterThanEqualAndFechaNacimientoLessThan(10, calendar.getTime()));
        System.out.println(jugadorRepository.findBycanastasTotalesGreaterThanEqualAndFechaNacimientoLessThan(10, calendar.getTime()));

        System.out.println(jugadorRepository.findByEquipoNombre("Barca"));
        System.out.println(jugadorRepository.findByEquipoNombreAndPosicionCampo("Barca", "Alero"));
        System.out.println("el jugador con mas canastas es " + jugadorRepository.findTopByOrderByCanastasTotalesDesc());
        System.out.println("Los jugadores con mas asistencias es " + jugadorRepository.findFirst5ByOrderByAsistenciasTotalesDesc());
        System.out.println(jugadorRepository.findByEquipoNombreAndTopCanastasTotales("Barca", new PageRequest(0, 1)));

    }


}

