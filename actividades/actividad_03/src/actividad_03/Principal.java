
package actividad_03;


public class Principal {

    public static void main(String[] args) {
       
    /*Creacion de Ataques*/
    Ataque lanzallas = new Ataque("lanzallama", 5);
    Ataque agilidad = new Ataque("agilidad", 10);
    Ataque trueno = new Ataque("trueno", 15);
    Ataque colaDeHierro = new Ataque("cola de hierro", 20);
    Ataque ningunAtaque = new Ataque();
    
    
    /*Creacion de Pokemones*/
        /*Charizard*/
        Pokemon charizard = new Pokemon("Charizard", "Fuego");
            /*Aprender ataques*/
            charizard.aprendeAtaque(lanzallas);
    
        /*Picachu*/
        Pokemon picachu = new Pokemon("Picachu", "electrico");
            /*Aprender ataques*/
            picachu.aprendeAtaque(agilidad);
            picachu.aprendeAtaque(trueno);
            picachu.aprendeAtaque(colaDeHierro);
    
        /*Pziduck*/
         Pokemon pziduck = new Pokemon("Psiduck", "agua");
            /*Aprender ataques*/
            pziduck.aprendeAtaque(ningunAtaque);
 
    /*Crear un Entrenador*/
    Entrenador entrenador = new Entrenador();
        /*Atrapar pokemones*/
          entrenador.atraparPokemon(pziduck);
          entrenador.atraparPokemon(charizard);
          entrenador.atraparPokemon(picachu);
         
          /*Ver nivel de Ataque Inicial */
          System.out.println("Nivel de Ataque "+ entrenador.nivelAtaque(pziduck));
          
                    /*Mostrar Ataques*/
          entrenador.mostrarAtques(pziduck);
           /*Atacar Pokemon*/
          entrenador.atacarPokemon(agilidad, pziduck);
          
          /*Ver nivel de Ataque*/
          System.out.println("Nivel de Ataque "+ entrenador.nivelAtaque(pziduck));
          
          /*Mostrar Ataques final*/
          entrenador.mostrarAtques(pziduck);
          

        
         
          
    
}
}
