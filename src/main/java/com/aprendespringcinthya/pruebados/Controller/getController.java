
package com.aprendespringcinthya.pruebados.Controller;

import com.aprendespringcinthya.pruebados.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getController {
    
    @GetMapping("/cliente/traer")
    @ResponseBody//annotation para especificar que se va a regresar en el cuerpo 
                 //del response lo que se tenga en el método
    public List<Cliente> traerClientes(){
        List <Cliente> listaClientes = new ArrayList<Cliente>();
  
        listaClientes.add(new Cliente(1L, "Cinthya", "Basilio"));
        listaClientes.add(new Cliente(2L, "Dulce", "Basilio"));
        listaClientes.add(new Cliente(3L, "Pedro", "Basilio"));
        listaClientes.add(new Cliente(4L, "Pablo", "Basilio"));
        return listaClientes;
       
    }
    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta(){
        return new ResponseEntity<> ("esta es una prueba del response", HttpStatus.NOT_FOUND);
    }
    
}
