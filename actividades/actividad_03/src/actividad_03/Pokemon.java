package actividad_03;

import java.util.ArrayList;

public class Pokemon {

    private String nombre;
    private Integer nivelAtaque;
    private String tipo;
    private ArrayList<Ataque> ataques = new ArrayList<>();

    public Pokemon() {
    }

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivelAtaque = this.sumaAtaques();
    }

    /*Metodos Accesor*/
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getNivelAtaque() {
        return this.nivelAtaque = this.sumaAtaques();

    }

    public void setNivelAtaque(Integer nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*Metodos Personalizados*/
    private void cargarAtaques(Ataque ataque) {
        ataques.add(ataque);
        
        
    }

    public void aprendeAtaque(Ataque aprender) {
        cargarAtaques(aprender);
    }

    public void mostrarAtaques() {
        for (Ataque ataque : ataques) {
            System.out.println("Ataques que tiene el pokemon " + this.nombre);
            System.out.println(ataque.getAtaque());
        }
    }

    public void atacar(Ataque ataque) {
        Ataque nuevoAtaque = new Ataque(ataque.getAtaque(), ataque.getPotencia());
         aprendeAtaque(nuevoAtaque);    
      }

    public Integer sumaAtaques() {
        Integer aux = 0;

        for (Ataque elemento : ataques) {
            aux += elemento.getPotencia();
        }
        return aux;
    }

    public void eliminarAtaque() {
        ataques.remove(0);
    }
}
