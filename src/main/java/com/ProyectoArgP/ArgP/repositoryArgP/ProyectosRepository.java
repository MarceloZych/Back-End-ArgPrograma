package com.ProyectoArgP.ArgP.repositoryArgP;

import com.ProyectoArgP.ArgP.entityArgP.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Integer> {
    
}
