package actividad1;

public class Principal {

    public static void main(String[] args) {
        MascotaVirtual tamagotchi = new MascotaVirtual(10, false, 180, false, true);
        
        //System.out.println(tamagotchi.toString());
        
        System.out.println("/************************************/");
        tamagotchi.jugar();
        tamagotchi.comer();
        tamagotchi.jugar();
        System.out.println(tamagotchi.toString());
    }

}
