package com.example.Controller;

import com.example.Model.Liga;
import com.example.repository.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by poo2 on 29/06/2015.
 */
@RestController //SIRVE PARA SABER QUE ES UN CONTROLADOR
@RequestMapping("/ligas")  //URL RELATIVA PARA ACCEDER AL CONTROLADOR
public class LigaController {
    @Autowired
    private LigaRepository ligaRepository;


    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Liga save(@RequestBody Liga liga) {
        return ligaRepository.save(liga);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Liga> findAll() {
        List<Liga> ligas = new ArrayList<Liga>();
        Iterator<Liga> iterator = ligaRepository.findAll().iterator();

        while (iterator.hasNext()) {
            ligas.add(iterator.next());
        }

        return ligas;
    }
/*
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Liga liga = ligaRepository.findOne(id);

        if(liga == null){throw new LigaException(id);}

        ligaRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Liga updateById(@PathVariable Long id, @RequestBody Liga liga) {
        Liga d1 = ligaRepository.findOne(id);

        if(d1 == null){throw new LigaException(id);}

        return ligaRepository.save(liga);
    }*/
}
