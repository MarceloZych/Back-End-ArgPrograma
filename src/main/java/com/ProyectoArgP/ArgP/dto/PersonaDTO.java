package com.ProyectoArgP.ArgP.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PersonaDTO {
     private Long id;
    
    private String nombre;
    private String apellido;
    private int dni;
    private String correoElectronico;

    private Date fechaNacimiento;
    
    private String acercaDe;

    public PersonaDTO() {
    }

    public PersonaDTO(Long id, String nombre, String apellido, int dni, String correoElectronico, Date fechaNacimiento, String acercaDe) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.acercaDe = acercaDe;
    }
}
