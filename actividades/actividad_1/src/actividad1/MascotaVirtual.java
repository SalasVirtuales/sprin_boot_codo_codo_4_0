package actividad1;

public class MascotaVirtual {

    private int nivel;
    private boolean aburrida;
    private int tiempo;
    private boolean hambrienta;
    private boolean contenta;

    public MascotaVirtual() {

    }

    public MascotaVirtual(int nivel, boolean aburrida, int tiempo, boolean hambrienta, boolean contenta) {
        this.nivel = nivel;
        this.aburrida = aburrida;
        this.tiempo = tiempo;
        this.hambrienta = hambrienta;
        this.contenta = contenta;
    }

    public int getNivel() {
        return nivel;
    }

    private void setNivel(int nivel) {
        this.nivel += nivel;
    }

    public boolean isAburrida() {
        return aburrida;
    }

    private void setAburrida(boolean aburrida) {
        this.aburrida = aburrida;
    }

    public int getTiempo() {
        return tiempo;
    }

    private void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isHambrienta() {
        return hambrienta;
    }

    private void setHambrienta(boolean hambrienta) {
        this.hambrienta = hambrienta;
    }

    public boolean isContenta() {
        return contenta;
    }

    private void setContenta(boolean contenta) {
        this.contenta = contenta;
    }

    public void comer() {
        if (isAburrida() && getTiempo() > 80 || isHambrienta()) {
            setContenta(true);
        }
        if (isContenta()) {
            setNivel(1);
        }
    }

    public void jugar() {
        if (!isHambrienta()) {
            if (isContenta()) {
                setNivel(2);
            }
            if (isAburrida()) {
                setContenta(true);
            }
        }

    }

    @Override
    public String toString() {
        return "MascotaVirtual \n\n" + "nivel=" + nivel + "\naburrida=" + aburrida + ",\ntiempo=" + tiempo + ",\nhambrienta=" + hambrienta + ",\ncontenta=" + contenta;
    }
    
}
