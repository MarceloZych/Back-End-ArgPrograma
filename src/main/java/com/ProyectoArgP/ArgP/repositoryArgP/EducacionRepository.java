package com.ProyectoArgP.ArgP.repositoryArgP;

import com.ProyectoArgP.ArgP.entityArgP.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Integer>{
    
}
