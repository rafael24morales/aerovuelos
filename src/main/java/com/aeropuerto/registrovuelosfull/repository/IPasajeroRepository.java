package com.aeropuerto.registrovuelosfull.repository;

import com.aeropuerto.registrovuelosfull.utileria.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPasajeroRepository extends JpaRepository<Pasajero,Integer> {

}
