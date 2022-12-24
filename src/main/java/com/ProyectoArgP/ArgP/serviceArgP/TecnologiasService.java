package com.ProyectoArgP.ArgP.serviceArgP;

import com.ProyectoArgP.ArgP.entityArgP.Tecnologias;
import com.ProyectoArgP.ArgP.repositoryArgP.TecnologiasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiasService {
    @Autowired
    TecnologiasRepository tecnoRepo;
    
    public List<Tecnologias> listaTecnologias(){
        return tecnoRepo.findAll();
    }
    
        public void saveTecnologias(Tecnologias tegno){
        tecnoRepo.save(tegno);
    }
    
    public void deleteTecnologias(int id){
        tecnoRepo.deleteById(id);
    }
    
     public Tecnologias findTecnologias(int id){
       
        Tecnologias perso = tecnoRepo.findById(id).orElse(null);
        return perso;
    }
}
