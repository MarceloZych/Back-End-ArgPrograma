package com.ProyectoArgP.ArgP.repositoryArgP;

import com.ProyectoArgP.ArgP.entityArgP.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona,Integer>{

}
