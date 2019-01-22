package com.aeropuerto.registrovuelosfull.controllers;

import com.aeropuerto.registrovuelosfull.services.VuelosDao;
import com.aeropuerto.registrovuelosfull.utileria.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VueloController {

    @Autowired
    VuelosDao vuelosDao;

    @GetMapping("/vuelos")
    public List<Vuelo> getVuelos(){

        return vuelosDao.findAllVuelos();

    }

    @PostMapping("/vuelos")
    public boolean postVuelo(@RequestBody Vuelo vuelo){
        return vuelosDao.posteaVuelo(vuelo);
    }

    @GetMapping("/vuelos/{id_vuelo}")
    public Vuelo getVueloPorId(@PathVariable("id_vuelo")int id_vuelo){
        return vuelosDao.findUno(id_vuelo);
    }

    @PutMapping("vuelos/{id_vuelos}")
    public boolean putVuelo(
            @PathVariable("id_vuelos")int id_vuelo,
            @RequestBody Vuelo vuelo){
        return vuelosDao.actualizaUnoPorId(id_vuelo,vuelo);
    }



}
