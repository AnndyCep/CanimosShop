
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

    public void modificarMascota(Mascota mascota, String nombreMascota, String raza, String color, 
            String observaciones, String nombreDueno, String celularDueno, String alergico, String atencionEpecial) {
        
        //setiamos los valores que traemos desde el objeto
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencionEpecial);
        //Modifico mascota, llamando a la persistencia
        controlPersis.modificarMascota(mascota);
        
        
        //buscamos el Dueño, por lo que se crea una metodo en esta clase, para buscarlo, se envia como parametro el ID del dueño
        Duenio duenio = this.buscarDuenio(mascota.getUnDuenio().getId_duenio());
        //Una vez se busque el dueño se setean los nuevos valores
        duenio.setNombre(nombreDueno);
        duenio.setCelDuenio(celularDueno);
        
        //medificamos datos duenio con los nuevos lavores enviados
        this.modificarDuenio(duenio);
        
    }
    //metodo para buscar Dueño
    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }
    //metodo para modificar  Dueño
    private void modificarDuenio(Duenio duenio) {
        controlPersis.modicarDuenio(duenio);
    }
    
}
