package com.aeropuerto.registrovuelosfull.controllers;


import com.aeropuerto.registrovuelosfull.utileria.Pasajero;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PasajeroController {

    @RequestMapping(value="/pasajeros", method = RequestMethod.GET)
    public List<Pasajero> getPasajeros(){
        return null;
    }

}
