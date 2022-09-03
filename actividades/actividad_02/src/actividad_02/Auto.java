
package actividad_02;


public final class Auto extends Vehiculo{
    private int plusVelocidad;
    private int velocidadFinal;
    private boolean ruedaAuxilio;

    public Auto() {
    super(100);
    this.plusVelocidad = 0;
    this.velocidadFinal = this.getVelocidad()+ this.getPlusVelocidad();
    this.ruedaAuxilio = false;
    }

    public int getPlusVelocidad() {
        return plusVelocidad;
    }

    public void setPlusVelocidad(int plusVelocidad) {
        this.plusVelocidad = plusVelocidad;
    }

    public int getVelocidadFinal() {
        return velocidadFinal;
    }

    public void setVelocidadFinal(int velocidadFinal) {
        this.velocidadFinal = velocidadFinal;
    }

    public boolean isRuedaAuxilio() {
        return ruedaAuxilio;
    }

    public void setRuedaAuxilio(boolean ruedaAuxilio) {
        this.ruedaAuxilio = ruedaAuxilio;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

   

    
    @Override
    public boolean esSeguro() {
        return this.isRuedaAuxilio() && this.velocidadFinal<= 140;
    }

    
    
    
}
