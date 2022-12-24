package com.ProyectoArgP.ArgP.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TecnologiasDTO {
        private int porcentaje;
        private String nombre;

    public TecnologiasDTO() {
    }

    public TecnologiasDTO(int porcentaje, String nombre) {
        this.porcentaje = porcentaje;
        this.nombre = nombre;
    }
}
