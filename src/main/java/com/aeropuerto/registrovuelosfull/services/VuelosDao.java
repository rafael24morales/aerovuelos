package com.aeropuerto.registrovuelosfull.services;

import com.aeropuerto.registrovuelosfull.repository.IVueloRepository;
import com.aeropuerto.registrovuelosfull.utileria.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VuelosDao {


    @Autowired
    IVueloRepository iVueloRepository;

    public List<Vuelo> findAllVuelos() {
        return iVueloRepository.findAll();
    }

    public boolean posteaVuelo(Vuelo vuelo) {

        if(iVueloRepository.save(vuelo)!= null){
            return true;
        }else{
            return false;
        }
    }
}
