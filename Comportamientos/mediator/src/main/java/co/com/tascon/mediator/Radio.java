package co.com.tascon.mediator;

public class Radio {
    private boolean encendida = false;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        encendida = true;
        mediator.apagaMusica();
        System.out.println("\nRadio encendida!\n");
    }

    public void apaga() {
        System.out.println("\nRadio apagada!\n");
        encendida = false;
    }

    public boolean encendida() {
        return encendida;
    }
}
