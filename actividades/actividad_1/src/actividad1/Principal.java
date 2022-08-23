
package actividad1;


public class Principal {
    public static void main(String[] args) {
        MascotaVirtual tamagotchi =new MascotaVirtual(10,false, 81 , true, false);
        tamagotchi.jugar();
        System.out.println(tamagotchi.getNivel());
        System.out.println(tamagotchi.isAburrida());
        System.out.println(tamagotchi.getTiempo());
        System.out.println(tamagotchi.isHambrienta());
        System.out.println(tamagotchi.isContenta());
    }
    
}
