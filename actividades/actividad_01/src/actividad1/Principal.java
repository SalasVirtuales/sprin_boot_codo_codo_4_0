package actividad1;

public class Principal {

    public static void main(String[] args) {
        /*Instancia de Mascota 1*/
        System.out.println("Mascota 01");
        MascotaVirtual mascota1 = new MascotaVirtual();

        System.out.println("/Datos inicial/");
        System.out.println(mascota1.toString());

        System.out.println("/************************************/");
        System.out.println("/Prueba/");

        mascota1.setTiempoAburrimiento(81);
        mascota1.setAburrida(false);
        mascota1.setHambrienta(true);
        mascota1.comer();
        System.out.println(mascota1.toString());
        
        /*Instancia de Mascota 1*/
        System.out.println("\n Mascota 02");
        MascotaVirtual mascota2 = new MascotaVirtual();

        System.out.println("/Datos inicial/");
        System.out.println(mascota2.toString());
        
        //mascota2.setContenta(true);
        mascota2.setHambrienta(true);
        mascota2.jugar();
        
        System.out.println(mascota2.toString());
    }

}
