package com.ProyectoArgP.ArgP.serviceArgP;

import com.ProyectoArgP.ArgP.entityArgP.Experiencia;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ProyectoArgP.ArgP.repositoryArgP.ExperienciaRepository;
import java.util.List;

@Service
@Transactional
public class ExperienciaService {
    
    @Autowired
    ExperienciaRepository expRepo;
    
    public List<Experiencia> ListaExp(){
        return expRepo.findAll();
    }
    
    public void saveExp(Experiencia exp){
        expRepo.save(exp);
    }
    
    public void deleteExp(int id){
        expRepo.deleteById(id);
    }
    
    public Experiencia findExp(int id){
        Experiencia exp = expRepo.findById(id).orElse(null);
        return exp;
    }
}
