package com.ProyectoArgP.ArgP.entityArgP;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private String nombre;
    private String tecnologiasUsadas;
    private String linkProyecto;

    public Proyectos() {
    }

    public Proyectos(String nombre, String tecnologiasUsadas, String linkProyecto) {
        this.nombre = nombre;
        this.tecnologiasUsadas = tecnologiasUsadas;
        this.linkProyecto = linkProyecto;
    }
}
