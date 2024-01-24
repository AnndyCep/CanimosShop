
package com.mycompany.caninosshop.logica;

import com.mycompany.caninosshop.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String raza, String color, String observaciones, 
            String nombreDueno, String celularDueno, String alergico, String atencionEpecial) {
            
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDueno);
        duenio.setCelDuenio(celularDueno);
        
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAtencion_especial(atencionEpecial);
        mascota.setAlergico(alergico);
        mascota.setObservaciones(observaciones);
        mascota.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio, mascota);
        
    }

    public List<Mascota> traerMascotas() {
        // Se direccion al paquete persistencia.
        return controlPersis.traerMascotas(); 
    }

    

    public void borrarMascota(int num_id) {
        controlPersis.borrarMascota(num_id);
    }

    public Mascota traerMascota(int num_id) {
        return controlPersis.traerMascota(num_id);
    }
    
}
