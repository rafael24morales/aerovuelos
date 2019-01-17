package com.aeropuerto.registrovuelosfull.controllers;


import com.aeropuerto.registrovuelosfull.utileria.Pasajero;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloPasajeroController {


    @PostMapping("/{id_vuelo}/pasajeros")
    public boolean postPasajerosDeVuelo(
            @PathVariable("id_vuelo") int id_vuelo,
            @RequestBody Pasajero pasajero
            ){
        return true;
    }

    @GetMapping("/{id_vuelo}/pasajeros/{id_pasajero}")
    public Pasajero getUnPasajeroDeVuelo(){
        return null;
    }

    @GetMapping("/{id_vuelo}/pasajeros")
    public List<Pasajero> getPasajerosDeVuelo(){
        return null;
    }

}
