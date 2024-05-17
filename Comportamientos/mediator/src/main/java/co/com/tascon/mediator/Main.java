package co.com.tascon.mediator;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n------------- Mediator -------------\n");

        Coche coche = new Coche();
        Radio radio = new Radio();
        Telefono telefono = new Telefono();

        Mediator mediator = new CocheMediator(coche, radio, telefono);

        coche.enciende();
        telefono.recibeLlamada();
        coche.apaga();
        
    }
}