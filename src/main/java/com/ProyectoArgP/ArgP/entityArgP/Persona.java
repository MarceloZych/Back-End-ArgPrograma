package com.ProyectoArgP.ArgP.entityArgP;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//incrementa el @Id en +1
    private Long id;
    
    private String nombre;
    private String apellido;
    private String img;
    private String correoElectronico;
    
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    
    @Lob
    @Column(name ="acercaDe",length =600)
    private String acercaDe;
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String img, String correoElectronico, Date fechaNacimiento, String acercaDe) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.acercaDe = acercaDe;
    }
}
