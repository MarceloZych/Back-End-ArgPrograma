package com.ProyectoArgP.ArgP.controllerArgP;

import com.ProyectoArgP.ArgP.entityArgP.Persona;
import com.ProyectoArgP.ArgP.serviceArgP.PersonaService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("persona") //localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired
    public PersonaService interPersona;
    
    @GetMapping ("/get")
    @ResponseBody
    private List<Persona> getPersona(){
        return interPersona.listaDePersonas();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    private Persona verPersona(@PathVariable int id){
        return interPersona.findPersona(id);
    }
    
    @PostMapping ("/save")
    public String createStudent(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deletePersona (@PathVariable int id){
        interPersona.deletePersona(id);
        
        return "la nueva persona fue eliminada correctamente";
    }
    
    //Edit
    @PutMapping ("personas/editar/{id}")
    public Persona editPersona (@PathVariable int id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("apellido") String nuevoApellido,
                                @RequestParam ("img") String nuevoImg,
                                @RequestParam("correoElectronico") String nuevoCorreo,
                                @RequestParam("fechaNacimiento") Date nuevaFecha,
                                @RequestParam("acercaDe") String nuevoAcercaDe){
        //busco la persona en cuestión
        Persona person = interPersona.findPersona(id);
        //esto también puede ir en service
        //para desacoplar mejor aún el código en un nuevo método
        person.setApellido(nuevoApellido);
        person.setNombre(nuevoNombre);
        person.setImg(nuevoImg);
        person.setCorreoElectronico(nuevoCorreo);
        person.setFechaNacimiento(nuevaFecha);
        person.setAcercaDe(nuevoAcercaDe);
                
        interPersona.savePersona(person);
        //retirna la nueva persona
        return person;
    }
}
