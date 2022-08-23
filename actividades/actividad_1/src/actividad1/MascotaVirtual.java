package actividad1;


public class MascotaVirtual {

    private int nivel;
    private int aburrida;
    private boolean hambrienta;
    private boolean contenta;

    public MascotaVirtual() {

    }

    public MascotaVirtual(int nivel, int aburrida, boolean hambrienta, boolean contenta) {
        this.nivel = nivel;
        this.aburrida = aburrida;
        this.hambrienta = hambrienta;
        this.contenta = contenta;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel += nivel;
    }

    public int getAburrida() {
        return aburrida;
    }

    public void setAburrida(int aburrida) {
        this.aburrida = aburrida;
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

    public void comer() {
        if (getAburrida() > 80) {
            setContenta(true);
            if (isHambrienta()) {
                setContenta(true);
            }
            if (isContenta()) {
                setNivel(1);
            }
        }
    }

    public void jugar() {
        if (getAburrida() > 80 || isContenta() && !isHambrienta()) {
            if (isContenta()) {
                setNivel(2);
            }
            if (getAburrida() > 80) {
                setContenta(true);
            }
        }
    }
}
