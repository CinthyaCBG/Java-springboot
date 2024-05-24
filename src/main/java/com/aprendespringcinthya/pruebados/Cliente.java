
package com.aprendespringcinthya.pruebados;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter //anotation que sustituyen los getters y setter explícitios
                //como métodos
public class Cliente {

    public Long id;
    public String nombre;
    public String apellido;

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
}
