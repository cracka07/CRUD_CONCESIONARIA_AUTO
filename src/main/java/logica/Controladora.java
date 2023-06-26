
package logica;

import java.util.List;
import static logica.Automovil_.modelo;
import static logica.Automovil_.motor;
import static logica.Automovil_.patente;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis=new ControladoraPersistencia();
    
    public void agregarAutomovil( String modelo, String marca, String motor,String color, int cantPuertas, String patente) {
        Automovil auto=new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setCantPuertas(cantPuertas);
        auto.setPatente(patente);
     
     
        
        controlPersis.agregarAutomovil(auto);
    
    }

    public List<Automovil> traerAutos() {
       return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

  
    public void editarAuto(Automovil auto, String modelo, String marca, String motor, String patente, int cantPuerta, String color) {
          
       auto.setColor(color);
       auto.setCantPuertas(cantPuerta);
       auto.setMarca(marca);
       auto.setModelo(modelo);
       auto.setPatente(patente);
       auto.setMotor(motor);
        controlPersis.editarAuto(auto);
    }
    
}
