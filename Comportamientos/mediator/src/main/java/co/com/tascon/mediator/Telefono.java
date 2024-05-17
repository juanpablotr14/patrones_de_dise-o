package co.com.tascon.mediator;

public class Telefono {
    private boolean musicaOn = false;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void recibeLlamada() {
        mediator.apagaRadio();
        System.out.println("\nLlamada recibida!\n");
    }

    public void enciendeMusica() {
        musicaOn = true;
        System.out.println("\nMusica encendida!\n");
    }

    public void apagaMusica() {
        musicaOn = false;
        System.out.println("\nMusica apagada!\n");
    }

    public boolean musicaEncendida() {
        return musicaOn;
    }
}
