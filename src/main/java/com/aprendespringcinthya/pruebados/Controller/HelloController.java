package com.aprendespringcinthya.pruebados.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //annotation para saber que se trata de un controlador 
                //todos los endpoints que tengamos irán en este archivo

public class HelloController {
    @GetMapping("/")  //annotation para identificar que se trata de un api 
                            //que recibe una solicitud mediante get, regrese lo siguiente
    public String sayHello(){
        return "Spring boot es una herramienta para \n desarrollar apis en java";
    }
    
    @GetMapping("/bye")  //annotation con el plath de url especificado
    public String sayBye(){
        return "Adiós, eso era todo";
    }
    
    @GetMapping("/hello/{nombre}")  //annotation con el plath de url especificado
                                    //más un parámetro que se pasará por la url
    public String sayHelloNombre(@PathVariable String nombre){ //@Path Variable para pasar una variable al path
        return "Hola " + nombre;
    }
    @GetMapping("/hello/{nombre}/{edad}/{profesion}")  //annotation con el plath de url especificado
                                    //más un parámetro que se pasará por la url
    public String sayHelloNombreEdadProfesion(@PathVariable String nombre,
                                              @PathVariable String edad,
                                              @PathVariable String profesion){ //se puede agregar más de un path
        return "Hola " + nombre + " tú tienes " + edad + " años y tu profesión es "
              + profesion;
    }
    
    @GetMapping("/hola")
    public String decirHola(@RequestParam String nombre,//con el request param, se reciben valores en el get
                                                        //pero en la url se agrega después del plath con ? y
                                                        //los demás valores parámetros con &
                            @RequestParam int edad,
                            @RequestParam String profesion){
        return "hola, tu nombre es " + nombre + ".Tu edad es " + edad +
                ". Tu profesión es " + profesion;
    }
}
