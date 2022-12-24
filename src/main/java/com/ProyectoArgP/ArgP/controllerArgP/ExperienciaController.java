package com.ProyectoArgP.ArgP.controllerArgP;

import com.ProyectoArgP.ArgP.entityArgP.Experiencia;
import com.ProyectoArgP.ArgP.serviceArgP.ExperienciaService;
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
@RequestMapping("/experiencia")
public class ExperienciaController {
    @Autowired
    ExperienciaService expServicio;
    
    @GetMapping("/allexp")
    @ResponseBody
    public List<Experiencia>getExperiencias(){
        return expServicio.ListaExp();
    }
    
    @GetMapping("/findexp")
    public Experiencia findExperiencia(@PathVariable int id){
        return expServicio.findExp(id);
    }
    
    @PostMapping("/saveexp")
    public void newExperiencia(@RequestBody Experiencia exp){
        expServicio.saveExp(exp);
    }
    
    @DeleteMapping("/delexp")
    public void deleteExperiencia(@PathVariable int id){
        expServicio.deleteExp(id);
    }
    
    @PutMapping("/editarexp")
    public Experiencia editExperiencia(@PathVariable int id,
                                                    @RequestParam("empresa") String nuevaEmpresa,
                                                    @RequestParam("tiempo") Date nuevoTiempo,
                                                    @RequestParam("descripcion") String nuevaDescripcion){
        Experiencia expe = expServicio.findExp(id);
        
        expe.setEmpresa(nuevaEmpresa);
        expe.setTiempo(nuevoTiempo);
        expe.setDescripcion(nuevaDescripcion);
        
        expServicio.saveExp(expe);
        
        return expe;
    }
}
