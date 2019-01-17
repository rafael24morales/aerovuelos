package com.aeropuerto.registrovuelosfull.utileria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pasajero {
    private int id_Boleto;
    private String nombre;
    private String asiento;
    private Vuelo vuelo;

}
