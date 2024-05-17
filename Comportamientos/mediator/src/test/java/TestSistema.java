import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import co.com.tascon.mediator.Coche;
import co.com.tascon.mediator.Radio;
import co.com.tascon.mediator.Telefono;
import co.com.tascon.mediator.CocheMediator;
import co.com.tascon.mediator.Mediator;

public class TestSistema {

    private Radio radio;
    private Telefono telefono;
    private Coche coche;
    private Mediator mediator;
    
    @Before
    public void init() {
        radio = new Radio();
        telefono = new Telefono();
        coche = new Coche();
        mediator = new CocheMediator(coche, radio, telefono);
    }
    
    @Test
    public void test_encender_apagar_coche() {
        assertFalse(radio.encendida());
        assertFalse(telefono.musicaEncendida());
        
        telefono.enciendeMusica();
        assertTrue(telefono.musicaEncendida());
        
        coche.enciende();
        
        assertTrue(radio.encendida());
        assertFalse(telefono.musicaEncendida());
    
        coche.apaga();
        assertFalse(radio.encendida());
    }

    @Test
    public void test_suena_telefono() {
        radio.enciende();
        assertTrue(radio.encendida());
        
        telefono.recibeLlamada();
        
        assertFalse(radio.encendida());
    }
    
    @Test
    public void test_enciende_radio() {
        
        telefono.enciendeMusica();
        assertTrue(telefono.musicaEncendida());
        
        radio.enciende();
        
        assertFalse(telefono.musicaEncendida());
    }
}
