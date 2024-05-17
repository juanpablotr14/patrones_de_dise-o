package co.com.tascon.mediator;

public class Coche {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        mediator.enciendeRadio();
        mediator.apagaMusica();
        System.out.println("\nCoche encendido!\n");
    }

    public void apaga(){
        mediator.apagaRadio();
        System.out.println("\nCoche apagado!\n");
    }
}
