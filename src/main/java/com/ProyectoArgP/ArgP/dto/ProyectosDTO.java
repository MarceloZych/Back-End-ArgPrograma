package com.ProyectoArgP.ArgP.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ProyectosDTO {
    private String nombre;
    private String tecnologiasUsadas;
    private String linkProyecto;

    public ProyectosDTO() {
    }

    public ProyectosDTO(String nombre, String tecnologiasUsadas, String linkProyecto) {
        this.nombre = nombre;
        this.tecnologiasUsadas = tecnologiasUsadas;
        this.linkProyecto = linkProyecto;
    }
    
}
