package co.com.tascon.mediator;

public class CocheMediator implements Mediator {
    private Coche coche;
    private Radio radio;
    private Telefono telefono;

    public CocheMediator(Coche coche, Radio radio, Telefono telefono) {
        this.coche = coche;
        this.radio = radio;
        this.telefono = telefono;
        
        this.coche.setMediator(this);
        this.radio.setMediator(this);
        this.telefono.setMediator(this);
    }

    @Override
    public void enciendeRadio() {
        radio.enciende();
    }

    @Override
    public void apagaRadio() {
        radio.apaga();
    }

    @Override
    public void recibeLlamada() {
        radio.apaga();
        telefono.apagaMusica();
    }

    @Override
    public void enciendeMusica() {
        telefono.enciendeMusica();
    }   

    @Override
    public void apagaMusica() {
        telefono.apagaMusica();
    }
}
