package actividad_02;

public class Principal {

    public static void main(String[] args) {
       System.out.println("/**************Conductores y vehiculos  seguros**************/");
        /*Vehiculos*/
                /*Instancio una moto Segura*/
                Moto honda = new Moto(2, 160);

                /*Instancio un auto Segura*/
                Auto kangoo = new Auto();
                kangoo.setPlusVelocidad(135);
                kangoo.setRuedaAuxilio(true);
                System.out.println(kangoo.isRuedaAuxilio());
                System.out.println(kangoo.getVelocidad());

        /*Conductores*/
                /*Instancio  conductor de Auto con registro*/
                Conductor conductorAuto = new Conductor();
                conductorAuto.setVehiculo(kangoo);
                conductorAuto.setRegistro(true);
                System.out.println(conductorAuto.esSeguro());

                /*Instancio  conductor de Moto*/
                Conductor conductorMoto = new Conductor();
                conductorMoto.setVehiculo(honda);
                System.out.println(conductorMoto.esSeguro());
                
        System.out.println("/**************Conductores y vehiculos no seguro**************/"); 
        
        /*Vehiculos*/
                /*Instancio una moto Segura*/
                Moto zanella = new Moto(1, 160);

                /*Instancio un auto Segura*/
                Auto palio = new Auto();
                palio.setPlusVelocidad(160);
                palio.setRuedaAuxilio(true);
                System.out.println(palio.isRuedaAuxilio());
                System.out.println(palio.getVelocidad());

        /*Conductores*/
                /*Instancio  conductor de Auto con registro*/
                Conductor conductorAuto2 = new Conductor();
                conductorAuto2.setVehiculo(palio);
                conductorAuto2.setRegistro(true);
                System.out.println(conductorAuto2.esSeguro());

                /*Instancio  conductor de Moto*/
                Conductor conductorMoto2 = new Conductor(zanella, true);
                System.out.println(conductorMoto2.esSeguro());
                System.out.println(conductorMoto2.esSeguro());
      }
}
