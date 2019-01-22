package com.aeropuerto.registrovuelosfull.controllers;


import com.aeropuerto.registrovuelosfull.services.VueloPasajeroDao;
import com.aeropuerto.registrovuelosfull.utileria.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VueloPasajeroController {

    @Autowired
    VueloPasajeroDao vueloPasajeroDao;


    @PostMapping("/vuelos/{id_vuelo}/pasajeros")
    public boolean postPasajerosDeVuelo(
            @PathVariable("id_vuelo") int id_vuelo,
            @RequestBody Pasajero pasajero
            ){


        return vueloPasajeroDao.postPasajero(id_vuelo,pasajero);
    }

    @GetMapping("/vuelos/{id_vuelo}/pasajeros/{id_pasajero}")
    public Pasajero getUnPasajeroDeVuelo(){
        return null;
    }

    @GetMapping("/vuelos/{id_vuelo}/pasajeros")
    public List<Pasajero> getPasajerosDeVuelo(@PathVariable Integer id_vuelo){
        return vueloPasajeroDao.pasajerosPorVuelo(id_vuelo);
    }

}
