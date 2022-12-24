package com.ProyectoArgP.ArgP.controllerArgP;

import com.ProyectoArgP.ArgP.entityArgP.Tecnologias;
import com.ProyectoArgP.ArgP.serviceArgP.TecnologiasService;
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
@RequestMapping("/tecnologias")
public class TecnologiasController {
    
    @Autowired
     TecnologiasService tecnoService;
    
    @GetMapping("/alltecno")
    @ResponseBody
    public List<Tecnologias> allTecnologias(){
        return tecnoService.listaTecnologias();
    }
    
    @GetMapping("/findtecno")
    public Tecnologias verTecnologia(@PathVariable int id){
        return tecnoService.findTecnologias(id);
    }
    
    @PostMapping("/savetecno")
    public void newTecno(@RequestBody Tecnologias tecno){
        tecnoService.saveTecnologias(tecno);
    }
    
    @DeleteMapping("/deltecno")
    public void deleteTecnologia(@PathVariable int id){
        tecnoService.deleteTecnologias(id);
    }
    
    @PutMapping("/edittecno")
    public Tecnologias editTecnologia(@PathVariable int id,
                                                @RequestParam("porcentaje") int nuevoPorcentaje,
                                                @RequestParam("nombre") String nuevoNombre){
         Tecnologias tecnology = tecnoService.findTecnologias(id);
         
         tecnology.setNombre(nuevoNombre);
         tecnology.setPorcentajeTecnologia(nuevoPorcentaje);
         
         tecnoService.saveTecnologias(tecnology);
         
         return tecnology;
    }
}
