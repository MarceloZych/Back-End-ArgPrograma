package com.ProyectoArgP.ArgP.entityArgP;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private String empresa;
    private Date tiempo;
    private String descripcion;

    public Experiencia() {
    }
    
    public Experiencia(String empresa, Date tiempo, String descripcion) {

        this.empresa = empresa;
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }
}
