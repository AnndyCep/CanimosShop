
package com.mycompany.caninosshop.persistencia;

import com.mycompany.caninosshop.logica.Duenio;
import com.mycompany.caninosshop.logica.Mascota;
import com.mycompany.caninosshop.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        // Crear en la bd duenio
        duenioJpa.create(duenio);
        
        //Crear en la db la mascota
        mascotaJpa.create(mascota);
    }

    public List<Mascota> traerMascotas() {
        // este metodo findMascoEntitys retorna todos los registros que existen en la base de datos.
        return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_id) {
        try {
            mascotaJpa.destroy(num_id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_id) {
        return mascotaJpa.findMascota(num_id);
    }
    
}
