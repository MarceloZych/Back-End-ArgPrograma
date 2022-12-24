package com.ProyectoArgP.ArgP.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EducacionDTO {
    private String titulo;
    private String Instituto;
    private Date fecha;

    public EducacionDTO() {
    }
    
    public EducacionDTO(String titulo, String Instituto, Date fecha) {
        this.titulo = titulo;
        this.Instituto = Instituto;
        this.fecha = fecha;
    }
}
