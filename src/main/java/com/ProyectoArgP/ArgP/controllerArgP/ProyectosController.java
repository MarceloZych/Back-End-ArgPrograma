package com.ProyectoArgP.ArgP.controllerArgP;

import com.ProyectoArgP.ArgP.entityArgP.Proyectos;
import com.ProyectoArgP.ArgP.serviceArgP.ProyectosService;
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
@RequestMapping("/proyectos")
public class ProyectosController {
    @Autowired
    ProyectosService proyeService;
    
    @GetMapping("/allproye")
    @ResponseBody
    public List<Proyectos> allProyectos(){
        return proyeService.listaProyectos();
    }
    
     @GetMapping("/findproyecto")
     public Proyectos verProyecto(@PathVariable int id){
         return proyeService.findProyectos(id);
     }
     
     @PostMapping("/saveproyecto")
     public void newProyecto(@RequestBody Proyectos proye){
         proyeService.saveProyectos(proye);
     }
     
     @DeleteMapping("/delproye")
     public void deleteProyecto(@PathVariable int id){
         proyeService.deleteProyectos(id);
     }
     
     @PutMapping("/editproyecto")
     private Proyectos editProyecto(@PathVariable int id,
                                                @RequestParam("nombre") String nuevoNombre,
                                                @RequestParam("tecnologiasUsadas") String nuevaTecnologia,
                                                @RequestParam("linkProyecto") String nuevoLink){
         
         Proyectos proyect = proyeService.findProyectos(id);
         
         proyect.setNombre(nuevoNombre);
         proyect.setTecnologiasUsadas(nuevaTecnologia);
         proyect.setLinkProyecto(nuevoLink);
         
         proyeService.saveProyectos(proyect);
         
         return proyect;
     }
}
