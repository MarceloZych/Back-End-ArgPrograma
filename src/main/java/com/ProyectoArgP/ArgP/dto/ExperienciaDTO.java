package com.ProyectoArgP.ArgP.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ExperienciaDTO {
    private String empresa;
    private Date tiempo;
    private String descripcion;
    
    public ExperienciaDTO() {
    }

    public ExperienciaDTO(int id, String empresa, Date tiempo, String descripcion) {
        this.empresa = empresa;
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }
}
