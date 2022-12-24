package com.ProyectoArgP.ArgP.entityArgP;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tecnologias {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//incrementa el @Id en +1
    
    private Long id;
    private String nombre;
    private int porcentajeTecnologia;

    public Tecnologias() {
    }

    public Tecnologias(Long id, String nombre, int porcentajeTecnologia) {
        this.id = id;
        this.nombre = nombre;
        this.porcentajeTecnologia = porcentajeTecnologia;
    }    
}
