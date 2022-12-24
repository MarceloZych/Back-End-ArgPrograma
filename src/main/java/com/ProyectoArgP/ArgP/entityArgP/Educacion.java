package com.ProyectoArgP.ArgP.entityArgP;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private Long id;
    private String titulo;
    private String Instituto;
    private Date fecha;

    public Educacion() {
    }

    public Educacion(Long id, String titulo, String Instituto, Date fecha) {
        this.id = id;
        this.titulo = titulo;
        this.Instituto = Instituto;
        this.fecha = fecha;
    }
    
}
