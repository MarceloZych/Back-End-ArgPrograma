package com.ProyectoArgP.ArgP.serviceArgP;

import com.ProyectoArgP.ArgP.entityArgP.Persona;
import com.ProyectoArgP.ArgP.repositoryArgP.PersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService {
    @Autowired
    public PersonaRepository unaPersona;
    
    public List<Persona> listaDePersonas(){
        return unaPersona.findAll();
    }
    
    public void savePersona(Persona perso){
        unaPersona.save(perso);
    }
    
    public void deletePersona(int id){
        unaPersona.deleteById(id);
    }
    
     public Persona findPersona(int id){
       
        Persona perso = unaPersona.findById(id).orElse(null);
        return perso;
    }
}
