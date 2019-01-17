package com.aeropuerto.registrovuelosfull.utileria;


import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString
@Entity
public class Vuelo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vuelo;

    @Column
    private String aeropuerto;

    @Column
    private String aerolinea;

    @Column
    private String ruta;


}
