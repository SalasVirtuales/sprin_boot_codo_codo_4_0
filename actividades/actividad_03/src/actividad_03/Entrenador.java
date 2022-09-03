package actividad_03;

import java.util.ArrayList;

public class Entrenador {

    private String nombre;
    private ArrayList<Pokemon> pokebola;

    public Entrenador() {
        this.nombre = "Ash";
        this.pokebola = new ArrayList<>();
    }

    /*Metodos Accesor*/
    public String getNombre() {
        return nombre;
    }

    /*Metodos Personalizados*/
    public void atraparPokemon(Pokemon pokemon) {
        pokebola.add(pokemon);
    }

    public void entrenarPokemon(Pokemon pokemon, Ataque ataque) {
        if(pokemon.getNombre().equals("charizard")){
        pokemon.aprendeAtaque(ataque);
        pokemon.eliminarAtaque();
        }else if(pokemon.getNombre().equals("picachu")){
         pokemon.aprendeAtaque(ataque);
        }
        
    }

    public Integer nivelAtaque(Pokemon pokemon) {
        return pokemon.getNivelAtaque();
    }

    public void atacarPokemon(Ataque ataque, Pokemon pokemon1) {
        if(pokemon1.getNombre().equals("Picachu")){
        pokemon1.atacar(ataque);
    }else if(pokemon1.getNombre().equals("Charizard")){
        pokemon1.atacar(ataque);
        pokemon1.eliminarAtaque();
    }
    
}

    public void mostrarAtques(Pokemon pokemon) {
        pokemon.mostrarAtaques();
    }
}
