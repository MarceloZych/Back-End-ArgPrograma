package com.ProyectoArgP.ArgP.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PersonaDTO {
     private Long id;
    
    private String nombre;
    private String apellido;
    private String img;
    private String correoElectronico;

    private Date fechaNacimiento;
    
    private String acercaDe;

    public PersonaDTO() {
    }

    public PersonaDTO(Long id, String nombre, String apellido, String img, String correoElectronico, Date fechaNacimiento, String acercaDe) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.acercaDe = acercaDe;
    }
}
