package actividad_02;

public class Conductor implements Seguro {

    private Vehiculo vehiculo;
    private boolean registro;

    public Conductor() {
    }

    public Conductor(Vehiculo vehiculo, boolean registro) {
        this.vehiculo = vehiculo;
        this.registro = registro;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean isRegistro() {
        return registro;
    }

    public void setRegistro(boolean registro) {
        this.registro = registro;
    }

    @Override
    public boolean esSeguro() {
        boolean aux = false;
        if (this.vehiculo instanceof Auto) {
            Auto auto = (Auto) vehiculo;
            aux = auto.esSeguro() && this.registro;
        } else {
            Moto moto = (Moto) vehiculo;
            aux = moto.esSeguro();
        }

        return aux ;

    }
}
