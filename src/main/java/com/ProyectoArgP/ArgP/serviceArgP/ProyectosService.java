package com.ProyectoArgP.ArgP.serviceArgP;

import com.ProyectoArgP.ArgP.entityArgP.Proyectos;
import com.ProyectoArgP.ArgP.repositoryArgP.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService {
    @Autowired
    ProyectosRepository proyectosRepo;
    
    public List<Proyectos> listaProyectos(){
        return proyectosRepo.findAll();
    }
    
    public void saveProyectos(Proyectos proye){
        proyectosRepo.save(proye);
    }
    
    public void deleteProyectos(int id){
        proyectosRepo.deleteById(id);
    }
    
    public Proyectos findProyectos(int id){
        Proyectos proye = proyectosRepo.findById(id).orElse(null);
        return proye;
    }
}
