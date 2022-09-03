package actividad1;

public class MascotaVirtual {

    private int nivel;
    private boolean aburrida;
    private int tiempoAburrimiento;
    private boolean hambrienta;
    private boolean contenta;

    public MascotaVirtual() {

    }

    public MascotaVirtual(int nivel, boolean aburrida, int tiempo, boolean hambrienta, boolean contenta) {
        this.nivel = validarNivel(nivel);
        this.aburrida = aburrida;
        this.tiempoAburrimiento = tiempo;
        this.hambrienta = hambrienta;
        this.contenta = contenta;
    }

    /*Metodos Accesors*/
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel += nivel;
    }

    public boolean isAburrida() {
        return aburrida;
    }

    public void setAburrida(boolean aburrida) {
        this.aburrida = aburrida;
    }

    public int getTiempo() {
        return tiempoAburrimiento;
    }

    public void setTiempo(int tiempo) {
        this.tiempoAburrimiento = tiempo;
    }

    public boolean isHambrienta() {
        return hambrienta;
    }

    public void setHambrienta(boolean hambrienta) {
        this.hambrienta = hambrienta;
    }

    public boolean isContenta() {
        return contenta;
    }

    public void setContenta(boolean contenta) {
        this.contenta = contenta;
    }

    public void setTiempoAburrimiento(int tiempoAburrimiento) {
        this.tiempoAburrimiento = tiempoAburrimiento;
    }

    /*Metodos Personalizados*/
    private int validarNivel(int nivel){
        int valor = 0;
        if(nivel>0){
           valor = nivel;
        }
        return valor;
    }
    public void comer() {
       if(getTiempo()>80){
        if (isAburrida() || isHambrienta()) {
            setContenta(true);
        }
        if (isContenta()) {
            setNivel(1);
        }   
       }
        
    }

    public void jugar() {
        if (!puedeJugar()) {
            if (isAburrida()) {
                setContenta(true);
            }

            if (isContenta()) {
                setNivel(2);

            }
        }

    }

    public boolean puedeJugar() {
        return this.isHambrienta();
    }

    @Override
    public String toString() {
        return "MascotaVirtual \n\n" + "nivel=" + nivel + "\naburrida=" + aburrida + ",\ntiempo=" + tiempoAburrimiento + ",\nhambrienta=" + hambrienta + ",\ncontenta=" + contenta;
    }

}
