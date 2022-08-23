
package actividad1;


public class Principal {
    public static void main(String[] args) {
        MascotaVirtual tamagotchi =new MascotaVirtual(10,81 , false, true);
        System.out.println(tamagotchi.getAburrida());
        tamagotchi.jugar();
        System.out.println(tamagotchi.isContenta());
        System.out.println(tamagotchi.isHambrienta());
        System.out.println(tamagotchi.getNivel());
    }
    
}
