
package actividad_02;


public final class Moto extends Vehiculo{
private int cantidadEspejos;

    public Moto() {
        super(0);
        this.cantidadEspejos =0;
    }

    public Moto(int cantidadEspejos, int velocidad) {
        super(velocidad);
        this.cantidadEspejos = cantidadEspejos;
    }

    public int getCantidadEspejos() {
        return cantidadEspejos;
    }

    public void setCantidadEspejos(int cantidadEspejos) {
        this.cantidadEspejos = cantidadEspejos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    

    @Override
    public boolean esSeguro() {
    return this.getVelocidad()<=160 && this.cantidadEspejos >= 2;
        
    }
    
  
  
    
    
}
