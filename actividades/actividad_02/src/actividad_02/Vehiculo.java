package actividad_02;

public abstract class Vehiculo implements Seguro{

    protected int velocidad;

    public Vehiculo() {
        this.velocidad = 0;
    }

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

   
}
