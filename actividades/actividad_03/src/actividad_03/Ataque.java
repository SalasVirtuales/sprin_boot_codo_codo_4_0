
package actividad_03;


public class Ataque {
private String ataque;
private Integer potencia;

    public Ataque() {
        this.ataque=null;
        this.potencia =0;
    }

    public Ataque(String ataque, Integer potencia) {
        this.ataque = ataque;
        this.potencia = potencia;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
    




}
