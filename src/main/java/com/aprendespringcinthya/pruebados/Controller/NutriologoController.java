
package com.aprendespringcinthya.pruebados.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NutriologoController {
    @GetMapping("/nutricion/{valor1}/{valor2}")
    public String sumaValores(@PathVariable double valor1, 
                              @PathVariable double valor2){
        double suma = valor1 + valor2;
        return "la suma de " + valor1 + " + " + valor2 + " = " + suma;
        
    }
    
     @GetMapping("/nutricion")
    public String sumaValorPrueba(){
       
        return "Bienvenido nutricion";
        
    }
}
