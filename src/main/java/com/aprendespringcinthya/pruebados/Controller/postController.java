
package com.aprendespringcinthya.pruebados.Controller;

import com.aprendespringcinthya.pruebados.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Creación del endpoint


@RestController
public class postController {
    
    @PostMapping("/cliente") //annotation para identificar cuando un método se va a ejecutar
                //en caso de que se reciba una solicitud de tipo POST. Entre paréntesis
                //se especifica la url
    public void crearCliente(@RequestBody Cliente cliente){//el @RequestBody se utiliza para
                                                            //especificar que se van a recibir bjetos
                                                            //en el body del POST
        
        System.out.println("Cliente creado");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido: " + cliente.getApellido() );
    }
}
