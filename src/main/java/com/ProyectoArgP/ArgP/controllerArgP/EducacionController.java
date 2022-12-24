package com.ProyectoArgP.ArgP.controllerArgP;

import com.ProyectoArgP.ArgP.entityArgP.Educacion;
import com.ProyectoArgP.ArgP.serviceArgP.EducacionService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class EducacionController {
    @Autowired
    EducacionService eduServicio;
    
    @GetMapping("/alleducacion")
    @ResponseBody
    public List<Educacion> getEducacion(){
        return eduServicio.ListaEducacion();
    }
    
    @GetMapping("/findeducacion")
    public Educacion findEducacion(@PathVariable int id){
        return eduServicio.findEducacion(id);
    }
    
    @PostMapping("/saveeducacion")
    public void newEducacion(@RequestBody Educacion edu){
        eduServicio.saveEducacion(edu);
    }
    
    @DeleteMapping("/deleducacion")
    public void deleteEducacion(@PathVariable int id){
        eduServicio.deleteEducacion(id);
    }
    
    @PutMapping("/editexp")
    public Educacion editEducacion(@PathVariable int id,
                                                    @RequestParam("titulo") String nuevoTitulo,
                                                    @RequestParam("Instituto") String nuevoInstituto,
                                                    @RequestParam("fecha") Date nuevaFecha){
        Educacion educacion = eduServicio.findEducacion(id);
        
        educacion.setTitulo(nuevoTitulo);
        educacion.setInstituto(nuevoInstituto);
        educacion.setFecha(nuevaFecha);
        
        eduServicio.saveEducacion(educacion);
        
        return educacion;
    } 
}
