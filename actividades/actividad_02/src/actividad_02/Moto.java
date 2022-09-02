
package actividad_02;


public class Moto extends Vehiculo{
private int velocidad;
private int cantidadEspejos;

    public Moto() {
        this.velocidad = 0;
        this.cantidadEspejos =0;
    }

    @Override
    public boolean esSeguro() {
    return this.velocidad <= 160 && this.cantidadEspejos >= 2;
        
    }
  
  
    
    
}
