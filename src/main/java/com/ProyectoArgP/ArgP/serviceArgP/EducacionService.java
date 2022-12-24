package com.ProyectoArgP.ArgP.serviceArgP;

import com.ProyectoArgP.ArgP.entityArgP.Educacion;
import com.ProyectoArgP.ArgP.repositoryArgP.EducacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    @Autowired
    EducacionRepository eduRepo;
    
    public List<Educacion> ListaEducacion(){
        return eduRepo.findAll();
    }
    
    public void saveEducacion(Educacion edu){
        eduRepo.save(edu);
    }
    
    public void deleteEducacion(int id){
        eduRepo.deleteById(id);
    }
    
    public Educacion findEducacion (int id){
        Educacion edu = eduRepo.findById(id).orElse(null);
        return edu;
    }
}
